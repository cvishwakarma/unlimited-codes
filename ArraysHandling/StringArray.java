/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arrayhandling;

/**
 *
 * @author Vishwa
 */
public class StringArray {
    public static void main(String[] args) {
        String arr[] = {"how","are","you","doing","in","your","office"};
        String toStr = "are";
        String fromStr = "your";
        StringArray sa = new StringArray();
        int begin = sa.getIndexNo(arr,toStr);
        int end = sa.getIndexNo(arr,fromStr);
        for (int i = begin; i <=end; i++) {
            System.out.println(arr[i]+" ");
            
        }
    }

    private int getIndexNo(String[] arr, String str) {
       int i = 0;
       for(String word: arr){
           if(word.equals(str)){
               break;
           }
           i++;
       }
       return i;
    }
}
