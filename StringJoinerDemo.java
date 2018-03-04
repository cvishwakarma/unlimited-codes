

	import java.util.*;
	public class StringJoinerDemo 	{
		public static void main(String args[])	{
			StringJoiner sj = new StringJoiner(",");
			StringJoiner sj2 = new StringJoiner(",","[","]");
			sj.add("Java");
			sj.add("Python");
			sj.add("C#");
			sj.add("Perl");
			sj.add("C++");
			sj2.add("Production Manager");
			sj2.add("Marketing Manager");
			sj2.add("Project Manager");
		    System.out.println(sj.toString());
			System.out.println(sj2.toString());
	
			

	}
}
