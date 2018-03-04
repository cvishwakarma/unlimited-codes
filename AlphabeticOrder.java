import java.util.*;
	public class AlphabaticOrder	{
		public static void main(String args[])	{
		int n;
		String temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of names");
		n = scan.nextInt();
		String names[] = new String[n];
		System.out.println("Enter all names");
	    for(int i=0; i<n; i++) {
		  names[i] = scan.nextLine();
		}
		for(int i=0;i<n;i++) {
		    for(int j=i+1;j<n;j++) {
			
		    if(names[i].compareTo(names[j]) {
              temp = names[i];
			  names[i] = names[j];
			  names[j] = temp;
			  
			
			}			
		} 
		
		}
		System.out.println("Names in Sorted Order:"):
		for(int i=0;i<n-1;i++)	{
		 System.out.println(names[i]+","):
		}
		System.out.println(names[n-1]);

	}

}