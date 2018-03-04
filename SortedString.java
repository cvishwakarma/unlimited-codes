
import java.util.*;
public class SortedString {
  public static void main(String args[]){
  String input = "hello";
  char [] charArr = input.toCharArray();
  Arrays.sort(charArr);
  String sortedString = new String(charArr);
  System.out.println(sortedString);
  
  }
  
}