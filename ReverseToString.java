
public class ReverseToString {
    public static String reverseWord(String s){
          String words[]=s.split("\\s");
          
            String reverseWord=""; 
            for(String w:words){ 
                StringBuilder sb=new StringBuilder(w); 
                sb.reverse(); 
                reverseWord+=sb.toString()+" "; 
            } 
            return reverseWord.trim(); 
        } 
        
    public static void main(String[] args) {
        System.out.println(reverseWord("I am good in programming language"));
    }
}