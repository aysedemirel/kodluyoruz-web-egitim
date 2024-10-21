package com.ayse.arrays;

import java.util.Arrays;

/**
 * Transposing a matrix means swapping the rows and columns of the matrix with the same number.
 * The matrix obtained as a result of this operation is the transpose of the initial matrix.
 * At this stage, the transpose of a kxn matrix becomes an nxk matrix.
 * For example, let's say we have a matrix A.
 * The transpose of this matrix A is denoted by A^T (A to the T).
 * For example, the transpose of the 2x3 matrix A below is a 2x3 matrix A^T.
 * <br/>
 * Output =>
 * Matrix :
 * 2 3 4
 * 5 6 4
 * Transpose :
 * 2 5
 * 3 6
 * 4 4
 * Matrix:
 * 1 2 3
 * 4 5 6
 * Transpose:
 * 1 4
 * 2 5
 * 3 6
 */
public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] arr1 = {
                {2, 3, 4},
                {5, 6, 4}
        };
        System.out.println("MATRIX: ");
        printMatrix(arr1);
        System.out.println("TRANSPOSE: ");
        printMatrix(getTranspose(arr1));
        System.out.println("================");
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("MATRIX: ");
        printMatrix(arr2);
        System.out.println("TRANSPOSE: ");
        printMatrix(getTranspose(arr2));
    }

    private static void printMatrix(int[][] numbers) {
        for (int[] row : numbers) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] getTranspose(int[][] numbers) {
        int[][] transpose = new int[numbers[0].length][numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int[] row = numbers[i];
            for (int j = 0; j < row.length; j++) {
                transpose[j][i] = row[j];
            }
        }
        return transpose;
    }
}
