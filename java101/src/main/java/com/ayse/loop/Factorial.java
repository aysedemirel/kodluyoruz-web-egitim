package com.ayse.loop;

import java.util.Scanner;

/**
 * The number of different groups of r elements that can be formed from a set of n elements is called the combination of n taken r at a time.
 * The combination of n taken r is denoted as C(n,r).
 * <p>
 * Write a program in Java to calculate combinations.
 * <p>
 * Combination formula: C(n,r) = n! / (r! * (n-r)!)
 *
 * @author aysedemirel
 */
public class Factorial {

    private int n;
    private int r;

    public Factorial() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("n: ");
            n = scanner.nextInt();
            System.out.print("r: ");
            r = scanner.nextInt();
            System.out.println("Control...");
        } while (n < r);
        scanner.close();
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.calculateFactorial();
    }

    // n! / (r! * (n-r)!)
    private void calculateFactorial() {
        int combination = getFactorial(n) / (getFactorial(r) * getFactorial(n - r));
        System.out.println("Combination: " + combination);
    }

    // n!
    private int getFactorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

}
