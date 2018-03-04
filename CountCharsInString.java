/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringhandling;

import java.util.Scanner;

/**
 *
 * @author Vishwa
 */
public class CountCharsInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String string = input.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
           if(string.charAt(i) == 'a')
           {
               count++;
           }
        }
        System.out.println("Number of chars in "+string+" : "+count);
    }
}
