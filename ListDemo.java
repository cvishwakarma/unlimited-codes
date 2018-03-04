
import java.util.LinkedList;
import java.util.ListIterator;
public class ListDemo	{
public static void main(String args[]) {
LinkedList<String> staff = new LinkedList<String>();
staff.add("Diana");
staff.add("Harry");
staff.add("Romeo");
staff.addLast("Tom");
ListIterator<String> iterator = staff.listIterator();
iterator.next();
iterator.next();
iterator.add("Juliet");
iterator.add("Nina");
iterator.next();
iterator.remove();
System.out.println(staff);

}
}