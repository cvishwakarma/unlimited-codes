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
/*
Write a program to get n positive integer by user, all input numbers are greater then 99 and less then 1000, remove first minimum digit of numbers and find second largest no from processed numbers.
Ex. Input Numbers : [100,123,416,542]
Processed Numbers: [10,23,46,54]
Second Largest: 46
*/
import java.util.ArrayList;
import java.util.List;

public class EliminatedMinimumDigit {

    public static void main(String[] args) {
        int[] arr = {100, 123, 416, 542};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = removeMinimumDigit(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Largest :: " + secondLargest);
    }

    public static int removeMinimumDigit(int number) {
        List<Integer> slipt = new ArrayList<Integer>();
        int rem = 0;
        int combine = 0;
        int min = Integer.MAX_VALUE;
        int count = 1;
        int num = number;
        int i = 0;
        while (num > 0) {
            num = num / 10;
            count = count * 10;
        }
        while (i++ < 3) {
            count = count / 10;
            rem = number / count;
            slipt.add(rem);
            number = number % count;
        }
        for (int data : slipt) {
            if (min > data) {
                min = data;
            }
        }
        slipt.remove(min);

        for (int data : slipt) {
            combine = (combine * 10) + data;
        }
        return combine;
    }

    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}

