/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

import java.util.Scanner;

/**
 *
 * @author Vishwa
 */
public class NCRNPR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        int n = input.nextInt();
        System.out.println("Enter r");
        int r = input.nextInt();
        int ncr = (fact(n)/(fact(n-r)*fact(r)));
        System.out.println("ncr = " + ncr);
        int npr = fact(n) / fact(n - r);
        System.out.println("npr = " + npr);

    }

    private static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
