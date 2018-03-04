import java.util.*;
public class SortString3 {
public static void main(String args[]) {
String str = "hello";
Character[] chars = new Character[str.length()];

for (int i = 0; i < chars.length; i++)
    chars[i] = str.charAt(i);

// sort the array
Arrays.sort(chars, new Comparator<Character>() {
    public int compare(Character c1, Character c2) {
        int cmp = Character.compare(
            Character.toLowerCase(c1.charValue()),
            Character.toLowerCase(c2.charValue())
        );
        if (cmp != 0) return cmp;
        return Character.compare(c1.charValue(), c2.charValue());
    }
});
for (int i = 0; i < chars.length; i++)
    System.out.print(chars[i]);

}
}