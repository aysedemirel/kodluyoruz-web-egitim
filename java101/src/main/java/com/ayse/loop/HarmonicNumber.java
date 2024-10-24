package com.ayse.loop;

import java.util.Scanner;

/**
 * Find harmonic series of entered number
 * <p>
 * 1+1/2+...1/n
 *
 * @author aysedemirel
 */
public class HarmonicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        double result = 0;
        for (int i = 1; i <= number; i++) {
            result += 1.0 / i;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
