/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vishwa
 */
public class StringAlphabaticOrder {

    public static void main(String args[]) {
        int n;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of names");
        n = scan.nextInt();
        String names[] = new String[n];
        System.out.println("Enter all names");
        for (int i = 0; i < n; i++) {
            names[i] = scan.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (names[i].compareTo(names[j])>0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;

                }
            }

        }
        System.out.println("Names in Sorted Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(names[i] + ",");
        }
        System.out.println(names[n - 1]);

    }

}
