/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class Palindrome {

    String orgStr;

    Palindrome() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String str = br.readLine();
        this.orgStr = str;
    }

    public String getString() {
        return orgStr;
    }

    public boolean isPalindrome(String orgStr) {
        for (int i = 0, j = orgStr.length() - 1; i < j; ++i, --j) {
            if (orgStr.charAt(i) == orgStr.charAt(j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String checkPalindrome(String orgStr) {
        String revStr = "";
        for (int i = orgStr.length() - 1; i >= 0; i--) {
            revStr += orgStr.charAt(i);
        }
        if (orgStr.equals(revStr)) {
            return orgStr + " is Palindrome (Using String Return Type)";
        } else {
            return orgStr + " is not Palindrome (Using String Return Type)";
        }
    }

    public void checkPalindromeUsingStack(String orgStr) {
        String revStr = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < orgStr.length(); i++) {
            stack.push(orgStr.charAt(i));
        }
        while (!stack.isEmpty()) {
            revStr += stack.pop();
        }
        if (orgStr.equals(revStr)) {
            System.out.println(orgStr + " is Palindrome (Using Stack)");
        } else {
            System.out.println(orgStr + " is not Palindrome (Using Stack)");
        }
    }

    public void checkPalindromeUsingQueue(String orgStr) {
        String revStr = "";
        Queue<Character> queue = new LinkedList<>();
        for (int i = orgStr.length() - 1; i >= 0; i--) {
            queue.add(orgStr.charAt(i));

        }
        while (!queue.isEmpty()) {
            revStr += queue.remove();
        }
        if (orgStr.equals(revStr)) {
            System.out.println(orgStr + " is Palindrome (Using Queue)");
        } else {
            System.out.println(orgStr + " is not Palindrome (Using Queue)");
        }
    }

    public void checkPalindromeUsingStringBuilder(String orgStr) {

    }

    public void checkPalindromeUsingStringBuffer(String orgStr) {

    }

    public static void main(String args[]) throws IOException {
        Palindrome p = new Palindrome();
        if (p.isPalindrome(p.getString())) {
            System.out.println(p.getString() + " is Palindrome (Using Boolean)");
        } else {
            System.out.println(p.getString() + " is not Palindrome (Using Boolean)");

        }
        String checkPalindrome = p.checkPalindrome(p.getString());
        System.out.println(checkPalindrome);
        p.checkPalindromeUsingStack(p.getString());
        p.checkPalindromeUsingQueue(p.getString());

    }
}
