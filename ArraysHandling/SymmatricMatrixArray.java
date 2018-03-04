/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SymmatricMatrixArray {

    int rows, cols;
    int matrix[][] = null;

    public int[][] getMatrix() {
        return matrix;
    }

    public SymmatricMatrixArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter # of rows");
        rows = input.nextInt();
        System.out.println("Enter # of cols");
        cols = input.nextInt();
        int count = 0;
        matrix = new int[rows][cols];
        System.out.println("Enter Matrix Elements");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("array%d[%d][%d] = ", ++count, row, col);
                matrix[row][col] = input.nextInt();

            }
        }

    }

    public static void main(String[] args) {
        SymmatricMatrixArray sma = new SymmatricMatrixArray();
        sma.printMatrix(sma.getMatrix());
        int tmatrix[][] = sma.transposeMatrix(sma.getMatrix());
        sma.symmatricMatrix(sma.getMatrix(), tmatrix);
        sma.printMatrix(sma.getMatrix());

    }

    private void printMatrix(int[][] matrix) {
        System.out.println("Matrix");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");

            }

        }
    }

    private int[][] transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[j][i];

            }

        }
        return matrix;
    }

    private void symmatricMatrix(int[][] matrix, int[][] tmatrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != tmatrix[i][j]) {
                    break;
                }
            }
            if (j != matrix[i].length) {
                break;
            }

        }
        if (i == matrix.length) {
            System.out.println("Symmeteric Matrix");
        } else {
            System.out.println("Please enter square matrix");
        }
    }
}
