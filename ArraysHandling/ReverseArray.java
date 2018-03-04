package ArraysHandling;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class ReverseArray {

    int arr[] = {2, 9, 4, 7, 6, 5, 8, 3, 10};
    char chr[] = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
    String str[] = {"Hi", "Friends", "How", "Are", "You"};

    public static void main(String[] args) {
        ReverseArray ra = new ReverseArray();
        System.out.println(Arrays.toString(ra.reverse(ra.arr)));
        System.out.println(Arrays.toString(ra.reverse(ra.chr)));
        System.out.println(Arrays.toString(ra.reverse(ra.str)));

    }

    private int[] reverse(int[] arr) {
        int result[] = new int[arr.length];

        for (int i = 0, j = result.length - 1; i < result.length; i++, j--) {
            result[j] = arr[i];
        }
        return result;

    }

    private char[] reverse(char[] chr) {
        char result[] = new char[chr.length];
        for (int i = 0, j = result.length - 1; i < result.length; i++, j--) {
            result[j] = chr[i];
        }
        return result;
    }

    private String[] reverse(String[] str) {
        String result[] = new String[str.length];
        for (int i = 0, j = result.length - 1; i < result.length; i++, j--) {
            result[j] = str[i];
        }
        return result;
    }
}
