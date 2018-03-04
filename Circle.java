	public class Circle{
	public static Circle instance = null;
	private Circle(){}
	public  final double pi = 3.14;
		
		public double area(int rad) {
			return pi*rad*rad;
		}
	public static Circle createInstance(){
	
	if(instance == null) {
	instance = new Circle();
	
	}
	return instance;
	}
		public static void main(String args[]) {
         Circle c1 = Circle.createInstance(); 
		 double area = c1.area(5);
		 System.out.println(area);
		 Circle c2 = Circle.createInstance();
		 double area2 = c2.area(4);
		 System.out.println(area2);
		}
	}