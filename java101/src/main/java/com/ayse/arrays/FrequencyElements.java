package com.ayse.arrays;

import java.util.Arrays;
import java.util.Objects;

/**
 * Find the frequency of each element in the array, and print the result.
 * Output is: [number] -> [frequency]
 * 10 -> 3
 * 20 -> 4
 * 5 -> 1
 *
 * @author aysedemirel
 */
public class FrequencyElements {

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        printFrequency(numbers);
    }
 
    private static void printFrequency(Integer[] numbers) {
        boolean[] visited = new boolean[numbers.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < numbers.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (Objects.equals(numbers[i], numbers[j])) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(numbers[i] + " -> " + count);
        }
    }
}
