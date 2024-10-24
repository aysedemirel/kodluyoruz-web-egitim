package com.ayse.loop;

import java.util.Scanner;

/**
 * The greatest common divisor of 18 and 24 is 6
 * <p>
 * The least common multiple of 6 and 8 is 24
 * <p>
 * LCM = (n1 * n2) / GCD
 * <p>
 * Write a Java program to find the GCD and LCM of two numbers using a "While Loop".
 *
 * @author aysedemirel
 */
public class GcdLcm {
    private final int number1;
    private final int number2;

    public GcdLcm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        number1 = scanner.nextInt();
        System.out.print("Number 2: ");
        number2 = scanner.nextInt();
        scanner.close();
    }

    public static void main(String[] args) {
        GcdLcm gcdLcm = new GcdLcm();
        System.out.println("GCD: " + gcdLcm.findGcd());
        System.out.println("LCM: " + gcdLcm.findLcm());
    }

    private int findLcm() {
        return (number1 * number2) / findGcd();
    }

    private int findGcd() {
        int num1 = number1;
        int num2 = number2;
        while (num2 > 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

}
