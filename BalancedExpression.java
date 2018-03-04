	import java.util.Stack;
public class BalancedExpression {
	    public static char TOKENS[][] = {{'{','}'},{'(',')'},{'[',']'}};
	    public static boolean isBalancedExpr(String expr) {
            Stack<Character> stack = new Stack<Character>();
            for(char ch: expr.toCharArray())
            {
              if(isOpenTerm(ch)) {
               stack.push(ch);
              }
              else { 
                  if(stack.isEmpty() || !matches(stack.pop(),ch))
                   {
                     return false;    
                   }
               }
                
            }
              return stack.isEmpty();
	}
            public static boolean isOpenTerm(char ch) {
	    for(char [] chArr : TOKENS)  {
              if(chArr[0] == ch) {
                 return true;
              }
            }
            return false;
               
	    }
             public static boolean matches(char openTerm, char closeTerm) {
               for(char [] chArr : TOKENS) {
                 if(chArr[0] == openTerm) {
                   return chArr[1] == closeTerm;
                 }
              }
                return false;			  
             }  
               public static void main(String args[]) {
               String str = "{()[]}";
                if(isBalancedExpr(str)){
                 System.out.println("Expression is true");
                 }
                  else{
                   System.out.println("Expression is false");
                  }
              }                                

      }