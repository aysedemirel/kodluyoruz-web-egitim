package com.ayse.loop;

import java.util.Scanner;

/**
 * Print a reverse triangle on the screen with stars (*) by taking the number of digits from the user in Java and using loops.
 * <p>
 * ********* * ********* 9 18+1
 * <p>
 * ******** * ******** 8 16+1
 * <p>
 * ******* * *******  7 14+1
 * <p>
 * ****** * ******   6 12+1
 * <p>
 * ***** * *****    5 10+1
 * <p>
 * **** * ****     4 8+1
 * <p>
 * *** * ***      3 6+1
 * <p>
 * ** * **       2 4+1
 * <p>
 * * * *        1 2+1
 * <p>
 * *          0 0+1
 *
 * @author aysedemirel
 */
public class ReverseTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of digits: ");
        int digitNumber = scanner.nextInt();
        drawTriangle(digitNumber);
        scanner.close();
    }

    private static void drawTriangle(int digitNumber) {
        for (int i = 0; i < digitNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < digitNumber - i - 1; k++) {
                System.out.print("**");
            }
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

}
