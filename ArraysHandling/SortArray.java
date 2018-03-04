/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SortArray {

    int rows, cols;
    Scanner input = new Scanner(System.in);

    public int[][] getMatrix() {
        return matrix;
    }
    int matrix[][] = null;

    public SortArray() throws IOException {
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
        SortArray sa = new SortArray();
        System.out.println(Arrays.deepToString(sa.matrix));
        sa.sortElementInArray(sa.matrix);
        System.out.println(Arrays.deepToString(sa.matrix));
    }

    private void sortElementInArray(int[][] matrix) {
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] > matrix[k][l]) {
                            temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }

                    }

                }

            }

        }
    }

 
}
