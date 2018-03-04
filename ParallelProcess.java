import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
  private static int count = 0;
	private Random rg = new Random();
	private BlockingQueue<Object> queue = null;

	public Producer(BlockingQueue<Object> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		synchronized (queue) {
			String item = "Item" + count;
			System.out.println("Producer: " + Thread.currentThread().getName()
					+ " adding " + item + " to the queue");
			count++;
			boolean success = queue.offer(item);
			while (!success) {
				success = queue.offer(item);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// continue again
				}
			}
		}
		try {
			long sleepTime = Math.abs(rg.nextLong()) % 500;
			System.out.println("Producer: " + Thread.currentThread().getName()
					+ " sleeping for " + sleepTime + "ms");
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable {
	private BlockingQueue<Object> queue = null;
	private Random rg = new Random();

	public Consumer(BlockingQueue<Object> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		boolean more = true;
		while (more) {
			String item = null;
			try {
				item = (String) queue.take();
			} catch (InterruptedException e) {
				System.out.println("Consumer: "
						+ Thread.currentThread().getName()
						+ " interrupted rcvd");
				break;
			}
			long sleepTime = Math.abs(rg.nextLong()) % 500;
			System.out.println("Consumer: " + Thread.currentThread().getName()
					+ " sleeping for " + sleepTime + "ms");
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				more = false;
			}

			System.out.println("Consumer: " + Thread.currentThread().getName()
					+ " received " + item + " from the queue");
		}
	}
}

public class ParallelProcess {
	int numProducer;
	int numConsumer;
	private Thread[] cThreads;
	private Thread[] pThreads;
	private BlockingQueue<Object> queue = null;

	public ParallelProcess(int numProcuder, int numConsumer, int queueSize) {
		this.numProducer = numProcuder;
		this.numConsumer = numConsumer;
		this.queue = new ArrayBlockingQueue<Object>(queueSize);

		// create consumer thread objects
		cThreads = new Thread[numConsumer];
		for (int i = 0; i < numConsumer; i++) {
			cThreads[i] = new Thread(new Consumer(queue));
		}

		// create producer thread objects
		pThreads = new Thread[numProducer];
		for (int i = 0; i < numProducer; i++) {
			pThreads[i] = new Thread(new Producer(queue));
		}
	}

	public void execute() {

		// start consumer threads
		for (Thread t : cThreads) {
			t.start();
		}

		// start producer threads
		for (Thread t : pThreads) {
			t.start();
		}

		// wait for all producer threads to finish
		for (Thread t : pThreads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// this situation is un-handled
				e.printStackTrace();
			}
		}

		// Once the producers are done with their job, we notify check if there
		// is anything left for the consumers to process.
		// If the queue is empty, the the consumer threads should also exit.
		while (true) {
			if (queue.size() > 0) {
				try {
					// wait 5 more seconds
					Thread.sleep(5 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				for (Thread t : cThreads) {
					t.interrupt();
				}
				break;
			}
		}

		// Wait for all the consumers threads to finish as well.
		for (Thread t : cThreads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// provide number of producers, number of consumers and the
		// max-queue-length
		ParallelProcess process = new ParallelProcess(8, 400, 2);
		process.execute();
		System.out.println("Thread: " + Thread.currentThread().getName()
				+ " FINISHED");
	}
}
