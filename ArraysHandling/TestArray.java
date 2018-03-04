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
public class TestArray {

    int arr[] = {10, 15, 20,25, 25, 30, 35, 40, 45, 50};

    public static void main(String[] args) {
        TestArray ta = new TestArray();
        ta.calcSumArr(ta.arr);
        ta.findMaxArr(ta.arr);
        ta.findMinArr(ta.arr);
        ta.findElementArr(25, ta.arr);
        ta.findDuplicateElements(ta.arr);

    }

    private void calcSumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("Total is " + sum);
    }

    private void findMaxArr(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Maximum " + max);
    }

    private void findMinArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Mininum " + min);
    }

    private void findElementArr(int element, int[] arr) {
        int position = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == element) {
                position = j;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Position of Element "+element+ " in Arr: " + position);

    }

    private void findDuplicateElements(int[] arr) {
       
    }
}
