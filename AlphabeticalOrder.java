import java.io.*;
class AlphabeticalOrder
{
static String n;
static int l;
public static void main(String args[]) throws IOException
 {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter a word : ");
 n = br.readLine();
 l = n.length();
 alphabetical();
 }
 public static void alphabetical()
 {
 char b[] = new char[l];
 for(int i=0;i<l;i++)
 b[i] = n.charAt(i);
 char t;
 for(int j=0;j<l-1;j++)
 {
  for(int k=0;k<l-1-j;k++)
  {
   if(b[k]>b[k+1])
   {
    t=b[k];
    b[k]=b[k+1];
    b[k+1]=t;
   }
  }
  }
 System.out.println("\nOriginal word : " +n);
 System.out.print("Sorted word : ");
 for(int m=0;m<l;m++)
  System.out.print(b[m]);
 System.out.print("\n");
 }
}