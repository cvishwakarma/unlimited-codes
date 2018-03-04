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
public class FibonacciNumber {

 public static void main(String args[])
    {
	
        int a=0, b=1, c=0, limit;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Upto How Many Term ? ");
        limit = scan.nextInt();
        
        /* print the first two terms of the Fibonacci series */
        
        System.out.print("Fibonacci Series : " + a + "  " + b + "  ");
        c = a + b;
        
        /* decrease the limit by 2, since the first two number 
         * of the Fibonacci series already printed manually
         */
        
        limit = limit - 2;
		
        while(limit>0)
        {
            System.out.print(c + "  ");
            a = b;
            b = c;
            c = a + b;
            limit--;
        }
		
    }

}
