import java.util.Arrays;
public class SJGTest {
 public static void main(String[] args) {
  String arr[] = { "how", "are", "you", "doing", "in", "your", "office" };
  String toStr = "are";
  String fromStr = "your";
  String newSortedArray[] = getArrayString(arr, toStr, fromStr);
  
  System.out.println(Arrays.toString(newSortedArray));
 }
}
public static String[] getArrayString(String[] arr, String toStr, String fromStr) {
String newArray[] = null;
int fromIndex = 0;
int toIndex = 0;

toIndex = Arrays.binarySearch(arr, "are");
fromIndex = Arrays.binarySearch(arr, "your");

newArray = Arrays.copyOfRange(arr, toIndex, fromIndex);

return newArray;
}
