package com.ayse.loop;

import java.util.Scanner;

/**
 * Write a program in Java that finds the largest and
 * smallest numbers among N counting numbers entered
 * from the keyboard and prints these numbers on the screen.
 *
 * @author aysedemirel
 */
public class MinMaxNumber {

    public static void main(String[] args) {
        System.out.print("Count: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        findMaxMin(count, numbers);
    }


    private static void findMaxMin(int count, int[] numbers) {
        if (count == 0) {
            return;
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < count; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}
