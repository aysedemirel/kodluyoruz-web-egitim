package com.ayse.loop;

import java.util.Scanner;

/**
 * A number is called a perfect number if the sum of its positive divisors (excluding the number itself)
 * is equal to the number.
 * <p>
 * Write a Java program that checks if a number entered from the keyboard is a perfect number or not,
 * and prints "is a perfect number" if it is, otherwise prints "is not a perfect number".
 *
 * @author aysedemirel
 */
public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = scanner.nextInt();
        printResult(number);
    }

    private static void printResult(int number) {
        if (isPerfectNumber(number)) {
            System.out.println(number + " is perfect number");
        } else {
            System.out.println(number + " is not perfect number");
        }
    }

    private static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
