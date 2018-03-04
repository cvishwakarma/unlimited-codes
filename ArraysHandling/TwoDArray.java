/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TwoDArray {

    int rows, cols;
    Scanner input = new Scanner(System.in);

    public int[][] getMatrix() {
        return matrix;
    }
    int matrix[][] = null;

    public TwoDArray() throws IOException {
        System.out.println("Enter # of rows");
        rows = input.nextInt();
        System.out.println("Enter # of cols");
        cols = input.nextInt();
        int count = 0;
        matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("array%d[%d][%d] = ", ++count, row, col);
                matrix[row][col] = input.nextInt();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        TwoDArray twoD = new TwoDArray();
        int largest = twoD.LargestElementInMatrix(twoD.getMatrix());
        int smallest = twoD.SmallestElementInMatrix(twoD.getMatrix());
        int sum = twoD.sumOfElementInMatrix(twoD.getMatrix());
        System.out.println("Largest Element: " + largest);
        System.out.println("Largest Element: " + smallest);
        System.out.println("Sum Matrix Element: " + sum);

    }

    private int LargestElementInMatrix(int[][] matrix) {
        int largest = matrix[0][0];
        int smallest = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%7d\n", matrix[row][col]);
                if (largest < matrix[row][col]) {
                    largest = matrix[row][col];
                }

            }

        }
        return largest;
    }

    private int SmallestElementInMatrix(int[][] matrix) {
        int largest = matrix[0][0];
        int smallest = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%7d\n", matrix[row][col]);
                if (smallest > matrix[row][col]) {
                    smallest = matrix[row][col];
                }
            }

        }
        return smallest;
    }

    private int sumOfElementInMatrix(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%7d\n", matrix[row][col]);
                sum += matrix[row][col];
            }

        }
        return sum;
    }
}
