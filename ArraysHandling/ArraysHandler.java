/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ArraysHandler {

    byte byteNumList[] = {9, 21, 13, 4, 15};
    short shortNumList[] = {22, 13, 17, 29, 12, 26, 39, 24};
    int intNumList[] = {210, 115, 320, 225, 330, 240, 145, 250, 55, 160, 365, 270, 75, 180, 285, 190};
    float floatNumList[] = {120, 90, 140, 70, 90, 170};
    double doubleNumList[] = {113.5, 252.6, 141.6, 243.1, 117.9, 222.5, 137.2};
    char charArray[] = {'c', 'h', 'a', 'n', 'd', 'r', 'a', 's', 'h', 'e', 'k', 'h', 'a', 'r'};
    String stringArray[] = {"W", "E", "L", "C", "O", "M", "E"};
    int arr[] = new int[10];

    public static void main(String[] args) {
         ArraysHandler ar = new ArraysHandler();
         printArrays(ar);
        
        System.out.println("*********************After Sorting*************");
        sortingArrays(ar);
        printArrays(ar);
        
        System.out.println("********************Parrallel Searching***********************");
        parallelSorting(ar);
        printArrays(ar);
        
        System.out.println("********************Binary Searching***********************");
        binarySearch(ar);
   
        Arrays.sort(ar.stringArray, 2, 6);
        System.out.printf("After sorting: %d to %d = %s\n",2,6,Arrays.toString(ar.stringArray));
        Arrays.sort(ar.charArray, 3, 10);
        System.out.printf("After sorting: %d to %d = %s\n",3,10,Arrays.toString(ar.charArray));
        Arrays.sort(ar.intNumList, 5, 10);
        System.out.printf("After sorting: %d to %d = %s\n",5,10,Arrays.toString(ar.intNumList));
        Arrays.fill(ar.arr,10);
        System.out.println("After filling value 10 in arr[] "+Arrays.toString(ar.arr));
   
    }
    

    private static void printArrays(ArraysHandler ar) {

        System.out.println(Arrays.toString(ar.byteNumList));
        System.out.println(Arrays.toString(ar.shortNumList));
        System.out.println(Arrays.toString(ar.intNumList));
        System.out.println(Arrays.toString(ar.floatNumList));
        System.out.println(Arrays.toString(ar.doubleNumList));
        System.out.println(Arrays.toString(ar.charArray));
        System.out.println(Arrays.toString(ar.stringArray));
    }

    private static void sortingArrays(ArraysHandler ar) {
        Arrays.sort(ar.byteNumList);
        Arrays.sort(ar.shortNumList);
        Arrays.sort(ar.intNumList);
        Arrays.sort(ar.floatNumList);
        Arrays.sort(ar.doubleNumList);
        Arrays.sort(ar.charArray);
        Arrays.sort(ar.stringArray);

    }

    private static void searchingArrays(ArraysHandler ar) {
        Scanner input = new Scanner(System.in);

        System.out.println(Arrays.toString(ar.stringArray));
        System.out.println("Enter a string to find in String Array ");
        String search = input.nextLine();
        for (int i = 0; i < ar.stringArray.length; i++) {
            if (ar.stringArray[i].equalsIgnoreCase(search)) {
                System.out.println(search + " in index " + i);
            }
            else
            {
                System.out.println(search+" index not found");
            }

        }
        System.out.println(Arrays.toString(ar.byteNumList));
        System.out.println("Enter a byte to find in Byte Array ");
        int num = input.nextInt();
        for (int i = 0; i < ar.byteNumList.length; i++) {
            if (ar.byteNumList[i] == num) {
                System.out.println(num + " index number is " + i);
            }
             else
            {
                System.out.println(num+" index not found");
            }

        }

        System.out.println(Arrays.toString(ar.shortNumList));
        System.out.println("Enter a short number to find in Short Array ");
        short nums = input.nextShort();
        for (int i = 0; i < ar.shortNumList.length; i++) {
            if (ar.shortNumList[i] == nums) {
                System.out.println(nums + " index number is " + i);
            }
             else
            {
                System.out.println(nums+" index not found");
            }

        }

        System.out.println(Arrays.toString(ar.intNumList));
        System.out.println("Enter a integer to find in Integer Array ");
        int numi = input.nextInt();
        for (int i = 0; i < ar.intNumList.length; i++) {
            if (ar.intNumList[i] == numi) {
                System.out.println(numi + " index number is " + i);
            }
             else
            {
                System.out.println(numi+" index not found");
            }

        }

        System.out.println(Arrays.toString(ar.floatNumList));
        System.out.println("Enter a float value to find in Float Array ");
        float numf = input.nextFloat();
        for (int i = 0; i < ar.floatNumList.length; i++) {
            if (ar.floatNumList[i] == numf) {
                System.out.println(numf + " index number is " + i);
            }
             else
            {
                System.out.println(numf+" index not found");
            }

        }

        System.out.println(Arrays.toString(ar.doubleNumList));
        System.out.println("Enter a double value to find in Double Array ");
        double numd = input.nextDouble();
        for (int i = 0; i < ar.doubleNumList.length; i++) {
            if (ar.doubleNumList[i] == numd) {
                System.out.println(numd + " index number is " + i);
            }
             else
            {
                System.out.println(numd+" index not found");
            }

        }

        /*
         System.out.println(Arrays.toString(ar.charArray));
         System.out.println("Enter a number to find in Char Array ");
         char ch = (char)input.nextInt();
         for (int i = 0; i < ar.charArray.length; i++) {
         if((char)ar.charArray[i] == ch )
         {
         System.out.println((char)ch+" index number is " + i);
         }
            
         }
         */
    }

    private static void binarySearch(ArraysHandler ar) {
        System.out.println(ar.byteNumList[3] + " in index"
                + " " + Arrays.binarySearch(ar.byteNumList, ar.byteNumList[3]));
        System.out.println(ar.shortNumList[3] + " in index"
                + " " + Arrays.binarySearch(ar.shortNumList, ar.shortNumList[3]));
        System.out.println(ar.intNumList[3] + " in index"
                + " " + Arrays.binarySearch(ar.intNumList, ar.intNumList[3]));
        System.out.println(ar.floatNumList[3] + " in index"
                + " " + Arrays.binarySearch(ar.intNumList, ar.intNumList[3]));
        System.out.println(ar.doubleNumList[3] + " in index"
                + " " + Arrays.binarySearch(ar.floatNumList, ar.floatNumList[3]));
        System.out.println(ar.charArray[3] + " in index"
                + " " + Arrays.binarySearch(ar.charArray, ar.charArray[3]));
        System.out.println(ar.stringArray[3] + " in index"
                + " " + Arrays.binarySearch(ar.stringArray, ar.stringArray[3]));

    }

    private static void parallelSorting(ArraysHandler ar) {

        Arrays.parallelSort(ar.byteNumList);
        Arrays.parallelSort(ar.shortNumList);
        Arrays.parallelSort(ar.intNumList);
        Arrays.parallelSort(ar.floatNumList);
        Arrays.parallelSort(ar.doubleNumList);
        Arrays.parallelSort(ar.charArray);
        Arrays.parallelSort(ar.stringArray);
    }

    private static void copyOfRangeArrays(ArraysHandler ar) {
        byte arrb[] = Arrays.copyOfRange(ar.byteNumList, ar.byteNumList[1], ar.byteNumList[3]);
        short arrs[] = Arrays.copyOfRange(ar.shortNumList, ar.shortNumList[2], ar.shortNumList[5]);
        int arri[] = Arrays.copyOfRange(ar.intNumList, ar.intNumList[2], ar.intNumList[5]);
        float arrf[] = Arrays.copyOfRange(ar.floatNumList, 2, 5);
        double arrd[] = Arrays.copyOfRange(ar.doubleNumList, 2, (int) 5);
        char arr_char[] = Arrays.copyOfRange(ar.charArray, ar.charArray[2], ar.charArray[5]);
        String arr_str[] = Arrays.copyOfRange(ar.stringArray, 2, 4);
        System.out.println(Arrays.toString(arrb));
        System.out.println(Arrays.toString(arrs));
        System.out.println(Arrays.toString(arri));
        System.out.println(Arrays.toString(arrf));
        System.out.println(Arrays.toString(arrd));
        System.out.println(Arrays.toString(arr_char));
        System.out.println(Arrays.toString(arr_str));
    }

    private static void copyOfArrays(ArraysHandler ar) {
        byte arrb[] = Arrays.copyOf(ar.byteNumList, ar.byteNumList.length);
        short arrs[] = Arrays.copyOf(ar.shortNumList, ar.shortNumList.length);
        int arri[] = Arrays.copyOf(ar.intNumList, ar.intNumList.length);
        float arrf[] = Arrays.copyOf(ar.floatNumList, ar.floatNumList.length);
        double arrd[] = Arrays.copyOf(ar.doubleNumList, ar.doubleNumList.length);
        char arr_char[] = Arrays.copyOf(ar.charArray, ar.charArray.length);
        String arr_str[] = Arrays.copyOf(ar.stringArray, ar.stringArray.length);
        System.out.println(Arrays.toString(arrb));
        System.out.println(Arrays.toString(arrs));
        System.out.println(Arrays.toString(arri));
        System.out.println(Arrays.toString(arrf));
        System.out.println(Arrays.toString(arrd));
        System.out.println(Arrays.toString(arr_char));
        System.out.println(Arrays.toString(arr_str));
    }

}
