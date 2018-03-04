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
public class MirrorMatrixArray {

    int rows, cols;
    int matrix[][] = null;

    public int[][] getMatrix() {
        return matrix;
    }

    public MirrorMatrixArray() {
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
        MirrorMatrixArray mma = new MirrorMatrixArray();
        mma.printMatrix(mma.getMatrix());
        mma.mirrorMatrix(mma.getMatrix());
        mma.printMatrix(mma.getMatrix());

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

    private void mirrorMatrix(int[][] matrix) {
        System.out.println("\nMirror Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length-1; j>=0; j--) {
                System.out.print(matrix[i][j]+"\t");                
                
            }
            System.out.println();
            
        }
    }
}
