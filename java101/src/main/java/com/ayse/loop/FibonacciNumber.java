package com.ayse.loop;

import java.util.Scanner;

/**
 * The Fibonacci series is a sequence of numbers where each number is the sum of the previous one.
 * In this sequence, when the numbers are divided by each other, the golden ratio emerges,
 * meaning that when a number is divided by the previous number, a sequence approaching the golden ratio is obtained.
 * <p>
 * The Fibonacci sequence starts from 0 and goes to infinity. Each number is added to the previous number.
 * The resulting number is written to the right of the number.
 * The first ten numbers of the Fibonacci sequence are as follows:
 * <p>
 * 9-element Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
 *
 * @author aysedemirel
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci number: ");
        int fibonacciNo = scanner.nextInt();
        printFibonacci(fibonacciNo);
        scanner.close();
    }

    private static void printFibonacci(int fibonacciNo) {
        int sum = 0;
        int first = 0;
        int second = 1;
        for (int i = 0; i <= fibonacciNo; i++) {
            System.out.print(first + " ");
            sum = first + second;
            first = second;
            second = sum;
        }
    }
}
