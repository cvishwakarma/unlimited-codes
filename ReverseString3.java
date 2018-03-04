import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseString3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the String you want to make it reverse:");
String input = scanner.nextLine();
char[] reverse = input.toCharArray();
List<Character> list = new LinkedList<Character>();
for (char c : reverse)
list.add(c);
Collections.reverse(list);
ListIterator<Character> itr = list.listIterator();
System.out.print("Reverse of the " + "'" + input + "' is: ");
while (itr.hasNext()) {
System.out.print(itr.next());
}
}
}