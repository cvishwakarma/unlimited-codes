class Iq1
{
	public static void swap(Integer a,Integer b){
	System.out.println("starting a = "+a+" b="+b);
	System.out.println("static method");
	Integer temp=new Integer(a);
	b=a;
	a=temp;
	System.out.println("Swapping: a "+a+" and b: "+b+" temp "+temp);
	}
	public static void main(String[] args) 
	{   System.out.println("Main Method");
		Integer a=new Integer(10); 
		Integer b=new Integer(20);
		System.out.println("Before Swap a:: "+a+" j:: "+b);
		swap(a,b);
		System.out.println("After Swap a:: "+a+" j:: "+b);
	}
}