/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author DELL
 */
public class FindEvenOrOdd {

    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 13, 15, 16, 20, 23, 24, 28, 29, 31, 34, 38, 37, 42, 45, 49, 51, 53, 54, 57, 62};
        Vector even = new Vector();
        Vector odd = new Vector();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }

        }
        System.out.println(even);   
        System.out.println(odd);
    }
}
