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
public class FindMissingNumber {

    public static void main(String[] args) {
     int n = 8;
            int[] a = {1, 2, 4,6, 3, 7, 8};
        int sumOfNnumbers = sumOfNnumbers(n);
        int sumOfElements = sumOfElements(a);
        int missingNumber = sumOfNnumbers - sumOfElements;
        System.out.printf("\nMissing Number: %d - %d = %d\n",sumOfNnumbers,sumOfElements,missingNumber);
    }

    private static int sumOfNnumbers(int n) {
        int sum = (n * (n + 1)) / 2;
        System.out.printf("%d/(%d+1)/2 = %d\n", n, n, sum);

        return sum;
    }

    private static int sumOfElements(int[] a) {
      int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];
            
        }
        return sum;
    }
}
