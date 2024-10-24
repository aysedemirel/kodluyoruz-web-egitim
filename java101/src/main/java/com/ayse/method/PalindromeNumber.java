package com.ayse.method;

import java.util.Scanner;

/**
 * A palindrome number is a number that reads the same backward as forward.
 * <p>
 * Examples: 1, 4, 8, 99, 101, 363, 4004, 9889....
 *
 * @author aysedemirel
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.println("is palindrome number ? -> " + isPalindromeNumber(number));
        scanner.close();
    }

    private static boolean isPalindromeNumber(int number) {
        int temp = number;
        int newNumber = 0;
        while (temp != 0) {
            int digit = temp % 10;
            newNumber = (newNumber * 10) + digit;
            temp /= 10;
        }
        return newNumber == number;
    }
}
