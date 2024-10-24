package com.ayse.loop;

import java.util.Scanner;

/**
 * Program that calculates the exponential number with the values entered by the user in Java
 * Do it using the "For Loop".
 * x^y
 *
 * @author aysedemirel
 */
public class ExponentialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        long x = scanner.nextLong();
        System.out.print("Y: ");
        long y = scanner.nextLong();
        long result = 1;
        for (long i = 0; i < y; i++) {
            result *= x;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
