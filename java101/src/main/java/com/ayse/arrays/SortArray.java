package com.ayse.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Sort the elements of an array from min to max.
 * Get the size of the array and the elements of the array from the user.
 * For example, output:
 * Dimension: 5
 * 0. -> 5
 * 1. -> 3
 * 2. -> 1
 * 3. -> 4
 * 4. -> 2
 * [1, 2, 3, 4, 5]
 *
 * @author aysedemirel
 */
public class SortArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dimension: ");
        int dimension = scanner.nextInt();
        int[] numbers = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            System.out.print(i + ". ->");
            numbers[i] = scanner.nextInt();
        }
        sortArray(numbers);
    }

    private static void sortArray(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
