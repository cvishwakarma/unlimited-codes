/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

/**
 *
 * @author Vishwa
 */
public class FindLongestPalindrome {

    public static String getLongestPalindrome(final String input) {
        int leftIndex = 0, rightIndex = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;
            rightIndex = centerIndex + 1;
            System.out.printf("(leftIndex,rightIndex) = (%d,%d)\n", leftIndex, rightIndex);
            while (leftIndex >= 0 && rightIndex < input.length()) {
                if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = input.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
                System.out.println("currentPalindrome "+currentPalindrome);
                System.out.println("longestPalindrome "+longestPalindrome);
                leftIndex--;
                rightIndex++;
                System.out.printf("(leftIndex,rightIndex) = (%d,%d)\n", leftIndex, rightIndex);

            }
        }
        return longestPalindrome;
    }

    public static void main(String[] args) {
        String str = "HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE";
        String longestPali = getLongestPalindrome(str);
        System.out.println("String: " + str);
        System.out.println("Longest Palindrome: " + longestPali);
    }
}
