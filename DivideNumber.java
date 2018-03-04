
	import java.util.*;
	import java.lang.*;
	public class DivideNumber {
		public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Dividend");
		int num1 = scanner.nextInt();
		System.out.println("Enter Divisor");
		int num2 = scanner.nextInt();
		int result = binaryDivide(num1,num2);
		System.out.println("Result "+result);
		int result2 = divide(num1,num2);
		System.out.println("Result "+result2);
		int result3 = div(num1,num2);
		System.out.println("Result "+result3);
		}
		private static int binaryDivide(int dividend, int divisor) {
		int current = 1;
		int denom = divisor;

		while (denom <= dividend) {
			current <<= 1;
			denom <<= 1;
		}

		denom >>= 1;
		current >>= 1;
		int answer = 0;
		// Now deal with the smaller number.
		while (current != 0) {
			if (dividend >= denom) {
				dividend -= denom;
				answer |= current;
			}
			current >>= 1;
			denom >>= 1;
		}
		return answer;
	}
	public static int divide(int numerator, int denominator){

    int q = 0;
    boolean isNumPos = (numerator >= 0) ? true : false;
    boolean isDenPos = (denominator >= 0) ? true : false;
     try {
    if (denominator == 0) throw new Exception("Divide by 0: not an integer result");

    numerator = Math.abs(numerator);
    denominator = Math.abs(denominator);

    while (denominator <= numerator) {
        numerator -= denominator;
        q++;
    }
	}
	catch(Exception ex){}

    return (isNumPos ^ isDenPos) ? -q : q;
}
  public static	int div(int dividend,int divisor){
       int count = 0;

    if(divisor == 0)
         return -1;   
    else if (divisor == 1)
         return 1;      
    else if(divisor > 1){

       for(int i=divisor;i<=dividend;i+=divisor){
           count++;
       }
    }
    return count;

}
public static double divide(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Division by 0 is undefined: " + a + "/" + b);
		}
		int sign = 1;
		if (a < 0) {
			a = -a;
			sign = -sign;
		}
		if (b < 0) {
			b = -b;
			sign = -sign;
		}
		double result = 0;
		while (a >= 0) {
			a -= b;
			result++;
		}
		return (result - 1) * sign;
	}
	
	}
	