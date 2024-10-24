package com.ayse.method;

import java.util.Scanner;

/**
 * Write a program in Java that performs exponentiation using a "Recursive" method, taking the base and exponent values from the user.
 * <p>
 * Enter the base value: 5 Enter the exponent value: 3 Result: 125
 *
 * @author aysedemirel
 */
public class ExponentCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int base;
        int exponent;
        do {
            System.out.print("Enter the base value :");
            base = scanner.nextInt();
            System.out.print("Enter the exponent: ");
            exponent = scanner.nextInt();
            System.out.println("Result: " + getResult(exponent, base));
            System.out.println("If you want to exit, please enter 0: (or continue with another number)");
            isExit = scanner.nextInt() == 0;
        } while (!isExit);
        scanner.close();
    }

    private static int getResult(int exponent, int base) {
        if (exponent == 0) {
            return 1;
        }
        return base * getResult(exponent - 1, base);
    }

}
