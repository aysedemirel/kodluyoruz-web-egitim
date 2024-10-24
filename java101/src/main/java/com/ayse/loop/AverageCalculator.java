package com.ayse.loop;

import java.util.Scanner;

/**
 * Calculate the average of numbers that are divisible by 3 and 4 from 0 to the entered number.
 *
 * @author aysedemirel
 */
public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.close();
        calculate(number);
    }

    private static void calculate(int number) {
        double sum = 0;
        double totalNum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                totalNum++;
            }
        }
        double average = (totalNum != 0) ? (sum / totalNum) : 0;
        System.out.println("Average: " + average);
    }

}
