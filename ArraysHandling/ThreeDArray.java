/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ThreeDArray {

    int r, c, w;
    Scanner input = new Scanner(System.in);

    public int[][][] getMatrix() {
        return matrix;
    }
    int matrix[][][] = null;

    public ThreeDArray() throws IOException {
        System.out.println("Enter # of r");
        r = input.nextInt();
        System.out.println("Enter # of c");
        c = input.nextInt();
        System.out.println("Enter # of w");
        w = input.nextInt();
        int count = 0;
        matrix = new int[r][c][w];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.printf("array%d[%d][%d][%d] = ", ++count, i, j, k);
                    matrix[i][j][k] = input.nextInt();
                }

            }

        }
    }

    public static void main(String[] args) throws IOException {
        ThreeDArray threeD = new ThreeDArray();
        int largest = threeD.LargestElementInMatrix(threeD.getMatrix());
        int smallest = threeD.SmallestElementInMatrix(threeD.getMatrix());
        int sum = threeD.sumOfElementInMatrix(threeD.getMatrix());
        System.out.println("Largest Element: " + largest);
        System.out.println("Largest Element: " + smallest);
        System.out.println("Sum Matrix Element: " + sum);

    }

    private int LargestElementInMatrix(int[][][] matrix) {
        int largest = matrix[0][0][0];
        int smallest = matrix[0][0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    if (largest < matrix[i][j][k]) {
                        largest = matrix[i][j][k];
                    }
                }
            }

        }
        return largest;
    }

    private int SmallestElementInMatrix(int[][][] matrix) {
        int largest = matrix[0][0][0];
        int smallest = matrix[0][0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    if (smallest > matrix[i][j][k]) {
                        smallest = matrix[i][j][k];
                    }

                }

            }

        }
        return smallest;
    }

    private int sumOfElementInMatrix(int[][][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    System.out.printf("%7d\n", matrix[i][j][k]);
                    sum += matrix[i][j][k];
                }

            }

        }
        return sum;

    }
}
