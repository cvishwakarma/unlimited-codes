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
public class ArmstronNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        int rem;
        int number = num;
        int armNum = 0;
        while (number != 0) {
            rem = number % 10;
            armNum = armNum + (rem * rem * rem);
            number = number / 10;
        }
        if (armNum == num) {
            System.out.println("Armstrong number true");
        } else {
            System.out.println("Armstrong number false");

        }
    }

}
