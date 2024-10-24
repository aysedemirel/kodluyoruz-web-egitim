package com.ayse.method;

import java.util.Scanner;

/**
 * Write a program in Java that determines if a number entered by the user is a "Prime" number using a "Recursive" method.
 *
 * @author aysedemirel
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int number;
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Number: ");
            number = scanner.nextInt();
            String result = isPrime(number, 2) ? " is a prime number." : " is not a prime number.";
            System.out.println("Recursive: " + number + result);
            System.out.println("Loop: " + getResult(number));
            System.out.print(
                    "If you want to exit, please enter 0 (or you can continue with another number) : ");
            isExit = scanner.nextInt() == 0;
        } while (!isExit);
        scanner.close();
    }

    private static boolean isPrime(int number, int i) {
        if (number <= 2) {
            return number == 2;
        }
        if (number % i == 0) {
            return false;
        }
        if (i * i > number) {
            return true;
        }
        return isPrime(number, i + 1);
    }

    private static String getResult(int number) {
        if (number < 2) {
            return number + " is not a prime number.";
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return number + " is not a prime number.";
            }
        }
        return number + " is a prime number.";
    }
}
