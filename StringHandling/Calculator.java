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
public class Calculator {

    Scanner input = null;

    public Calculator() {
        input = new Scanner(System.in);
        System.out.println("************CALCULATOR**************");
        System.out.println("ENTER 1 FOR ADDITION");
        System.out.println("ENTER 2 FOR SUBTRACTION");
        System.out.println("ENTER 3 FOR MULTIPLICATION");
        System.out.println("ENTER 4 FOR DIVISION");
        System.out.println("Enter 5 FOR PERCENTAGE");
        System.out.println("ENTER 6 FOR SQURE ROOT");
        System.out.println("ENTER 7 FOR CUBE");
        int operationCode = input.nextInt();
        operationManager(operationCode);
    }

    private void operationManager(int operationCode) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        switch (operationCode) {
            case 1:
                num1 = getNum();
                num2 = getNum();
                result = addition(num1, num2);
                System.out.printf("\nAddition %d+%d = %d\n", num1, num2, result);
                break;
            case 2:
                num1 = getNum();
                num2 = getNum();
                result = subtraction(num1, num2);
                System.out.printf("\nSubtraction %d-%d = %d\n", num1, num2, result);
                break;
            case 3:
                num1 = getNum();
                num2 = getNum();
                result = multiplication(num1, num2);
                System.out.printf("\nMultiplication %d*%d = %d\n", num1, num2, result);
                break;
            case 4:
                num1 = getNum();
                num2 = getNum();
                result = division(num1, num2);
                System.out.printf("\nDivision %d/%d = %d\n", num1, num2, result);
                break;
            case 5:
                num1 = getNum();
                num2 = getNum();
                result = percentage(num1, num2);
                System.out.printf("\nPercentage %d/%d = %d\n", num1, num2, result);
                break;
            case 6:
                num1 = getNum();
                result = square(num1);
                System.out.printf("\nSquare %d*%d = %d\n", num1,num1,result);

                break;
            case 7:
                num1 = getNum();
                result = cube(num1);
                System.out.printf("\nCube %d*%d*%d = %d\n", num1,num1,num1,result);

                break;
            default:
                System.err.println("You entered wrong choice try again...");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    private int getNum() {
        System.out.println("Enter  Number");
        return input.nextInt();
    }


    private int addition(int num1, int num2) {
        return Math.abs(num1) + Math.abs(num2);
    }

    private int subtraction(int num1, int num2) {
        return Math.abs(num1) - Math.abs(num2);
    }

    private int multiplication(int num1, int num2) {
        return Math.abs(num1) * Math.abs(num2);
    }

    private int division(int num1, int num2) {
        if (num2 <= 0) {
            throw new IllegalArgumentException("denometer should not be zero or less than");
        }
        return num1 / num2;
    }

    private int percentage(int num1, int num2) {
        return num1 * 100 / num2;
    }

    private int square(int num1) {
        return num1*num1;
    }

    private int cube(int num1) {
     return num1*num1*num1;
    }
}
