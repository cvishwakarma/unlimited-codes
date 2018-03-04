
    // First Scenario
	public class Addition	{
	private int a;
	private int b;
	public void setA(int a) {
	  this.a = a;
	}
	public void setB(int b) {
	this.b = b;
	}
	private static Addition instance = null;
        private Addition() {
		//don't remove it, its intentionally created
		}
		public static Addition createInstance(){
		   if(instance == null){
		       instance = new Addition();
		   }
		   return instance;
		}
		public int add()  {
		return a+b;
		}
		public int add(int a, int b) {
		return a+b;
		}
		
	
		public static void main(String args[]){
		Addition addition = Addition.createInstance();
		addition.setA(10);
		addition.setB(20);
		int sum = addition.add();
		System.out.println("Sum "+sum);
		Addition addition2 = Addition.createInstance();
		addition2.setA(20);
		addition2.setB(30);
		int sum2 = addition2.add();
		System.out.println("Sum2 "+sum2);
        int ahash = addition.hashCode();
        int bhash = addition2.hashCode();
        if(ahash == bhash){
         System.out.println("Hashcode is same: true");
          } 		
		
		
		}
	}

	