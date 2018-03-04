/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class EqualityArrays {
    public static void main(String[] args) {
       int arr1[] = {1, 2, 3, 4, 6};
        int arr2[] = Arrays.copyOf(arr1, arr1.length);
        if (EqualityArrays.isEqualArrays(arr1, arr2)) {
            System.out.println(Arrays.toString(arr1) + " is eqaul to " + Arrays.toString(arr2));
        } else {
            System.out.println(Arrays.toString(arr1) + " is not eqaul to " + Arrays.toString(arr2));
        }  
    }

    private static boolean isEqualArrays(int[] arr1, int[] arr2) {
       if(arr1.length !=arr2.length)
           return false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
            
        }
        return true;
    }
}
