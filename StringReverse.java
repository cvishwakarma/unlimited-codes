import java.util.*;
class StringReverse{
public static void main(String[] args){
System.out.println("enter a string:");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[] ch=s.toCharArray();
char[] c=new char[ch.length];
for(int i=ch.length-1;i>=0;i--)
{
c[ch.length-i-1]=ch[i];
}
for(int i=0;i<c.length;i++){
System.out.print(c[i]);
}
}
}
