package com.ayse.arrays;

import java.util.Arrays;

/**
 * Find average and harmonic average of numbers in an array
 * Output is "AVERAGE: 15.4" and "HARMONIC AVERAGE: 4.1916167664670665"
 *
 * @author aysedemirel
 */
public class FindAverage {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 60};
        System.out.println(Arrays.toString(numbers));
        System.out.println("AVERAGE: " + findAverage(numbers));
        System.out.println("HARMONIC AVERAGE: " + findHarmonicAverage(numbers));
    }

    private static double findAverage(int[] numbers) {
        double result = 0;
        if (numbers.length != 0) {
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            result = sum / numbers.length;
        }
        return result;
    }

    private static double findHarmonicAverage(int[] numbers) {
        double result = 0;
        if (numbers.length != 0) {
            double sum = 0;
            for (int number : numbers) {
                sum += (1.0 / number);
            }
            if (sum == 0) return result;
            result = (numbers.length / sum);
        }
        return result;
    }
}
