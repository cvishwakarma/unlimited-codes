/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arrayhandling;

import java.util.Arrays;

/**
 *
 * @author Vishwa
 */
public class PrintToFromStringArr {
    public static void main(String[] args) {
          String arr[] = {"how","are","you","doing","in","your","office"};
        String toStr = "are";
        String fromStr = "your";
        String newSortedArray[] = getArrayString(arr,toStr,fromStr);
        System.out.println(Arrays.toString(newSortedArray));
    }

    private static String [] getArrayString(String[] arr, String toStr, String fromStr) {
     String newArray[] = null;
     int fromIndex = 0;
     int toIndex = 0;
     toIndex = Arrays.binarySearch(arr, toStr);
     fromIndex = Arrays.binarySearch(arr, fromStr);
     newArray = Arrays.copyOfRange(arr, toIndex, fromIndex+1);
     return newArray;
    }
}
