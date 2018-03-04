/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

/**
 *
 * @author DELL
 */
public class MissingNumberArray {
    public static int count = 0;
    public static int position = 0;
    public static boolean flag = false;
    
    public static void main(String[] args) {
        int arr[] = {0,1,2,5,7,9,10,13,14,16,19,20};
        findMissingNumber(arr,position);
    }

    private static void findMissingNumber(int[] arr, int position) {
         if(position == arr.length-1)
         {
             return;
         }
         for(position = 0;position<arr[arr.length-1];position++)
         {
             if((arr[position]-count)!=position)
             {
                 System.out.println("Missing Number "+(position+count));
                 flag = true;
                 count++;
                 break;
             }
         }
         if(flag)
         {
             flag = false;
             findMissingNumber(arr,position);
         }
    }
}
