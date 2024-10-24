package com.ayse.method;

import java.util.Scanner;

/**
 * The Fibonacci series is a sequence of numbers where each number is the sum of the previous one.
 * In this sequence, when the numbers are divided by each other, the golden ratio emerges,
 * meaning that when a number is divided by the previous number, a sequence approaching the golden ratio is obtained.
 * <p>
 * The Fibonacci sequence starts from 0 and goes to infinity. Each number is added to the previous number. The result is written to the right side of the number.
 * The first ten numbers of the Fibonacci sequence are as follows:
 * <p>
 * 9-element Fibonacci Series: 0 1 1 2 3 5 8 13 21
 * <p>
 * This example is a program that finds the Fibonacci number using recursive methods.
 *
 * @author aysedemirel
 */
public class RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci index: ");
        int fibonacciIndex = scanner.nextInt();
        System.out.print(
                "The " + fibonacciIndex + "th fibonacci number is:" + printFibonacci(fibonacciIndex));
        scanner.close();
    }

    private static int printFibonacci(int fibonacciIndex) {
        if (fibonacciIndex == 1 || fibonacciIndex == 2) {
            return 1;
        }
        return printFibonacci(fibonacciIndex - 1) + printFibonacci(fibonacciIndex - 2);
    }
}
