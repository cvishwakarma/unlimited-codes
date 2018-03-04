/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandliing;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CheckPalindromeTest {

    public static void main(String[] args) throws IOException {
        CheckPalindrome cp = new CheckPalindrome();
        cp.checkPalindromeUsingQueue("aAbbCbbAa");
        cp.checkPalindromeUsingStack("zYxxYz");
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String string = cp.getString();
        if (cp.isPaliindrome(string)) {
            System.out.println(str + " is Palindrome (Using Boolean Return Type)");
        } else {
            System.out.println(str + " is not Palindrome (Using Boolean Return Type)");

        }
        System.out.println(cp.checkPalindrome(str));

    }

}
