package com.ayse.method;

import java.util.Scanner;

/**
 * Write a "Recursive" method in Java that follows the rule below based on the value of n received from the user without using a loop.
 * <p>
 * Rule: Subtract 5 from the entered number until the number is 0 or negative. Print the final value to the screen during each subtraction.
 * After the number becomes negative or 0, add 5 again. Print the final value to the screen during each addition.
 * <p>
 * N Number: 10
 * <p>
 * Output: 10 5 0 5 10
 *
 * @author aysedemirel
 */
public class MethodByPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.print("Please enter a positive number: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println(number);
            } else {
                System.out.print(number + " ");
                getPattern(number - 5, false, number);
            }
            System.out.println("\nIf you want to exit, please enter 0 (or enter another number) : ");
            isExit = (scanner.nextInt() == 0);
        }
        scanner.close();
    }

    private static void getPattern(int no, boolean isReverse, int number) {
        System.out.print(no + " ");
        if (no != number) {
            if (!isReverse) {
                isReverse = (no <= number && no <= 0);
            }
            int pattern = isReverse ? 5 : -5;
            getPattern(no + pattern, isReverse, number);
        }
    }
}
