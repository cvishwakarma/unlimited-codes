/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandliing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class CheckPalindrome {


    public String getString() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a String");
            String orgString = br.readLine();
            return orgString;
        } catch (IOException ex) {
            Logger.getLogger(CheckPalindrome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean isPaliindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; ++i, --i) {
            if (str.charAt(i) == str.charAt(j)) {
                return true;
            }
        }
        return false;
    }

    public String checkPalindrome(String str) {
        String revString = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }
        if (str.equalsIgnoreCase(revString)) {
            return str + " is Palindrome (Using String Return Type)";
        } else {
            return str + " is not Palindrome (Using String Return Type)";
        }
    }

   
    public  void checkPalindromeUsingStack(String originalString) {
        String reverseString = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < originalString.length(); i++) {
            stack.push(originalString.charAt(i));
        }
        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }
        if (originalString.equals(reverseString)) {
              System.out.println(originalString+" is Palindrome(Using Stack)");
        }
        else
        {
            System.out.println(originalString+" is not Palindrome (Using Stack)");
        }

    }

    public void checkPalindromeUsingQueue(String orgStr) {
        String revStr = "";
        Queue queue = new LinkedList();
        for (int i = orgStr.length() - 1; i >= 0; i--) {
            queue.add(orgStr.charAt(i));
        }
        while (!queue.isEmpty()) {
            revStr += queue.remove();
        }
        if (orgStr.equalsIgnoreCase(revStr)) {
            System.out.println(orgStr + " is Palindrome (Using Queue)");
        } else {
            System.out.println(orgStr + " is not Palindrome (Using Queu)");
        }

    }

    public void checkPalindromeUsingStringBuffer(String orgStr) {

    }

    public void checkPalindromeUsingStringBuilder(String orgStr) {

    }

}
