public class PalindromeClass{

public  static String longestPalindromeString(String in) {
        char[] input = in.toCharArray();
        int longestPalindromeStart = 0;
        int longestPalindromeEnd = 0;

        for (int mid = 0; mid < input.length; mid++) {
            // for odd palindrome case like 14341, 3 will be the mid
            int left = mid-1;
            int right = mid+1;
            // we need to move in the left and right side by 1 place till they reach the end
            while (left >= 0 && right < input.length) {
                // below check to find out if its a palindrome
                if (input[left] == input[right]) {
                    // update global indexes only if this is the longest one till now
                    if (right - left > longestPalindromeEnd
                            - longestPalindromeStart) {
                        longestPalindromeStart = left;
                        longestPalindromeEnd = right;
                    }
                }
                else
                    break;
                left--;
                right++;
            }
            // for even palindrome, we need to have similar logic with mid size 2
            // for that we will start right from one extra place
            left = mid;
            right = mid + 1;// for example 12333321 when we choose 33 as mid
            while (left >= 0 && right < input.length)
            {
                if (input[left] == input[right]) {
                    if (right - left > longestPalindromeEnd
                            - longestPalindromeStart) {
                        longestPalindromeStart = left;
                        longestPalindromeEnd = right;
                    }
                }
                else
                    break;
                left--;
                right++;
            }


        }
        // we have the start and end indexes for longest palindrome now
        return in.substring(longestPalindromeStart, longestPalindromeEnd + 1);
    }
public static void main(String args[]){
System.out.println(longestPalindromeString("abbabbaxabbabba toppottoppottoppot abbabbayabbabba"));
}

}
