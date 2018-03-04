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
public class Reverse {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,8,9};
        String arr2[] = {"W","E","L","C","O","M","E"};
        char ch[] ={'w','e','l','c','o','m','e'};
        System.out.println(Arrays.toString(Reverse.reverse(arr)));
        System.out.println(Arrays.toString(Reverse.reverse(arr2)));
        System.out.println(Arrays.toString(Reverse.reverse(ch)));
    }

    private static int[] reverse(int[] list) {
      int result [] = new int[list.length];
        for (int i = 0, j=result.length-1;i<list.length; i++,j--) {
            result[j] = list[i];
            
        }
        return result;
    }
    private static char [] reverse(char [] ch)
    {
        char result [] = new char[ch.length];
        for (int i = 0,j=result.length-1; i < ch.length; i++,j--) {
            result[i] = ch[j];
            
        }
        return result;
        
    }

    private static String [] reverse(String[] arr2) {
        String [] result = new String[arr2.length];
        for (int i = 0, j = result.length-1;i<arr2.length;i++,j--) {
         result[j] = arr2[i];   
        }
         return result;
    }
}
