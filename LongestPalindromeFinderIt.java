
	public class LongestPalindromeFinderIt {
		public static void main(String args[]) {
					System.out.println(getLongestPalindromeOdd("12321"));
		          System.out.println(getLongestPalindromeOdd("aba12321abc"));
				  System.out.println(getLongestPalindromeOdd("abcmadamdba"));
				  System.out.println(getLongestPalindromeOdd("abllmvjaajvmllab"));

		
		}
		private static String getLongestPalindrome(String string) {
    String odd = getLongestPalindromeOdd(string);
    String even = getLongestPalindromeEven(string);
    return (odd.length() > even.length() ? odd : even);
}

public static String getLongestPalindromeOdd(final String input) {
    int rightIndex = 0, leftIndex = 0;
    String currentPalindrome = "", longestPalindrome = "";
    for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
        leftIndex = centerIndex;
        rightIndex = centerIndex + 1;
        while (leftIndex >= 0 && rightIndex < input.length()) {
            if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                break;
            }
            currentPalindrome = input.substring(leftIndex, rightIndex + 1);
            longestPalindrome = currentPalindrome.length() > longestPalindrome
                    .length() ? currentPalindrome : longestPalindrome;
            leftIndex--;
            rightIndex++;
        }
    }
    return longestPalindrome;
}

public static String getLongestPalindromeEven(final String input) {
    int rightIndex = 0, leftIndex = 0;
    String currentPalindrome = "", longestPalindrome = "";
    for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
        leftIndex = centerIndex - 1;
        rightIndex = centerIndex + 1;
        while (leftIndex >= 0 && rightIndex < input.length()) {
            if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                break;
            }
            currentPalindrome = input.substring(leftIndex, rightIndex + 1);
            longestPalindrome = currentPalindrome.length() > longestPalindrome
                    .length() ? currentPalindrome : longestPalindrome;
            leftIndex--;
            rightIndex++;
        }
    }
    return longestPalindrome;
}
}