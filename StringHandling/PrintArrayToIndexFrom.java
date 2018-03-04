/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

/**
 *
 * @author Vishwa
 */
public class PrintArrayToIndexFrom {

    static String arr[] = {"how", "are", "you", "doing", "at", "your", "office"};
    static String toStr = "are";
    static String fromStr = "your";

    public static void main(String[] args) {
        printArr(arr, toStr, fromStr);
    }

    private static void printArr(String[] arr, String toStr, String fromStr) {
        int startIndex = findIndex(arr, toStr);
        int endIndex = findIndex(arr, fromStr);
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = startIndex; i <= endIndex; i++) {
            sb.append(arr[i]);
            if (i == endIndex) {
                sb.append("]");
            }
            sb.append(",");

        }
        System.out.println(sb.toString());
    }

    private static int findIndex(String[] arr, String str) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                index = i;
            }
        }
        return index;
    }

}
