package com.ayse.arrays;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Find min, find max, find the closest min, find the closest max
 * Output is:
 * Min: -778, Max: 788, VALUE: 5, Close min: 2, Close max: 12
 *
 * @author aysedemirel
 */
public class FindMinMax {

    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(list));
        System.out.println("Min: " + getMin(list));
        System.out.println("Max: " + getMax(list));
        System.out.println("VALUE: " + 5);
        System.out.println("Close min: " + getClosestMin(list, 5));
        System.out.println("Close max: " + getClosestMax(list, 5));
    }

    private static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int getMax(int @NotNull [] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int getClosestMin(int[] arr, int value) {
        int len = arr.length;
        int res = arr[0];
        for (int i = 1; i < len; i++) {
            if (Math.abs(value - res) >
                    Math.abs(value - arr[i])) {
                res = arr[i];
            }
        }
        return res;
    }

    private static int getClosestMax(int[] arr, int value) {
        int len = arr.length;
        int res = arr[0];
        for (int i = 1; i < len; i++) {
            if (value < arr[i] && Math.abs(value - res) >
                    Math.abs(value - arr[i])) {
                res = arr[i];
            }
        }
        return res;
    }
}
