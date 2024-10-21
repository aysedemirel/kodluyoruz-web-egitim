package com.ayse.arrays;

import java.util.Arrays;

/**
 * Find duplicate numbers in an array and print them.
 * For example, if the input is {2, 5, 6, 1, 2, 4, 6, 4, 6, 6, 2, 8, 8}
 * Output is "2 * 6 * 4 * 8 *"
 *
 * @author aysedemirel
 */
public class DuplicateNumbers {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 1, 2, 4, 6, 4, 6, 6, 2, 8, 8};
        System.out.println(Arrays.toString(numbers));
        printDuplicateEven(numbers);
    }

    private static void printDuplicateEven(int[] list) {
        int[] evenNums = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && !isFind(evenNums, list[i])) {
                    evenNums[startIndex++] = list[i];
                    break;
                }
            }
        }
        for (int value : evenNums) {
            if ((value != 0) && (value % 2 != 1)) {
                System.out.print(value + " * ");
            }
        }
    }

    private static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

}
