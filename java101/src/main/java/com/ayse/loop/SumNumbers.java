package com.ayse.loop;

import java.util.Scanner;

/**
 * Write a program in Java that accepts entries from the user until a single number is entered with loops,
 * and prints the sum of the numbers entered, which are even and multiples of 4, on the screen.
 *
 * @author aysedemirel
 */
public class SumNumbers {

    public static void main(String[] args) {
        boolean isNotOdd = true;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter numbers. To stop, enter an odd number: ");
        while (isNotOdd) {
            int num = scanner.nextInt();
            isNotOdd = (num % 2 == 0);
            if (num % 4 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
