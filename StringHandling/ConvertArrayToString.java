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
public class ConvertArrayToString {

    public static void main(String[] args) {
        String arr[] = {"a", "b", "c", "d", "e", "f"};
        String result = covertInToString(arr);
        System.out.println(result);
    }

    private static String covertInToString(String[] arr) {
        int iMax = arr.length - 1;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0;; i++) {
            sb.append(arr[i]);
            if (i == iMax) {
                return sb.append("]").toString();
            }
            sb.append(",");
        }
    }

}
