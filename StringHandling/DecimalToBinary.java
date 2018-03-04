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

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number");
        int decNum = input.nextInt();
        int quot = decNum;
        int i=1,j,rem;
        int binNum[] = new int[100];
        while(quot!=0){
            binNum[i++] = quot%2;
            quot = quot/2;
        }
        System.out.println("Equivalence binary number "+decNum+" is "+"\n");
        for ( j = i-1; j >0; j--) {
            System.out.print(binNum[j]);
        }
        System.out.println("");
    }
}
