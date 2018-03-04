/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SumOfColumnAndRow {

    int rows, cols;

    public SumOfColumnAndRow() {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.####");

        System.out.println("Enter # of rows");
        rows = console.nextInt();
        System.out.println("Enter # of cols");
        cols = console.nextInt();
        int matrix[][] = new int[rows][cols];
        int k = 0;
        int count = 0;
        int sumRows[] = new int[rows];
        int sumCols[] = new int[cols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("array%d[%d][%d] = ", ++count, row, col);
                matrix[row][col] = console.nextInt();

            }
        }
        int sumRow = 0, sumCol = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sumRow += matrix[row][col];
                sumCol += matrix[col][row];
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
            sumRows[k] = sumRow;
            sumCols[k] = sumCol;
            k++;
            sumRow = 0;
            sumCol = 0;
        }

        for (int i = 0; i < rows; i++) {
            System.out.println("sum of rows " + (i + 1) + " " + df.format(sumRows[i]));

        }
        for (int i = 0; i < cols; i++) {
            System.out.println("sum of columns " + (i + 1) + " " + df.format(sumCols[i]));

        }
    }

    public static void main(String[] args) {
        SumOfColumnAndRow scar = new SumOfColumnAndRow();

    }
}
