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
public class MergedArray {

    public static void main(String[] args) {
        Integer a[] = {1, 2, 3, 4};
        Integer b[] = {5, 6, 7, 8};
        Integer c[] = concat(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

    }

    private static Integer[] concat(Integer[] a, Integer[] b) {
        int aLen = a.length;
        int bLen = b.length;
        Integer c[] = new Integer[aLen + bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }
}
