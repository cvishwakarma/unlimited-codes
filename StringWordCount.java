import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringWordCount {
Map<Integer, String> map = new TreeMap<>();

public Map<Integer, String> getCount(String msg) {
int length = 0;

String[] splitstring = msg.trim().split("\\.|!|\\?");

for (String splitstring1 : splitstring) {

String[] string2 = splitstring1.trim().split("\\s");
length = string2.length;
map.put(length, splitstring1.trim());
}
return map;
}

@SuppressWarnings("rawtypes")
public static void main(String[] args) {
StringWordCount s = new StringWordCount();
Map<Integer, String> m = s.getCount("Please come and attend the class. Good Morning! How are you?");
Set set = m.entrySet();

Iterator iterator = set.iterator();
while (iterator.hasNext()) {
Map.Entry me = (Map.Entry) iterator.next();
System.out.print(me.getValue() + ": ");
System.out.println(me.getKey());
}
}
}