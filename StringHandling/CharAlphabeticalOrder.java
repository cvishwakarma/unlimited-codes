/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Vishwa
 */
public class CharAlphabeticalOrder {

    static String word;
    static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word: ");
        word = br.readLine();
        length = word.length();
        alphabetical(word, length);
        //word --> zamaica
    }

    private static void alphabetical(String word, int length) {
        char b[] = new char[length];
        for (int i = 0; i < length; i++) {
            b[i] = word.charAt(i);
        }
        System.out.println(Arrays.toString(b));
        char temp;
        for (int j = 0; j < length - 1; j++) {
            for (int k = 0; k < length - 1 - j; k++) {
                System.out.printf("(i,j)= (%d,%d)\n", j, k);
                if (b[k] > b[k + 1]) {
                    temp = b[k];
                    System.out.printf("temp = %c\n", b[k]);
                    b[k] = b[k + 1];
                    System.out.printf("b[k] = %c\n", b[k + 1]);
                    b[k + 1] = temp;
                    System.out.printf("b[k+1] = %c\n", temp);

                }
            }
        }
        System.out.println("\n Original word: " + word);
        System.out.println("sorted order");
        for (int z = 0; z < 10; z++) {
            System.out.print(b[z]);
            System.out.print("\n");
        }
    }
}
