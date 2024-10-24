package com.ayse.loop;

import java.util.Scanner;

/**
 * Draw a triangle
 *
 * @author aysedemirel
 */
public class TriangleDrawer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row: ");
        int row = scanner.nextInt();
        System.out.println("Triangle: ");
        drawTriangle(row);
        System.out.println("Diamond: ");
        drawDiamond(row);
        scanner.close();
    }

    private static void drawTriangle(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < (row - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private static void drawDiamond(int row) {
        drawTriangle(row);
        for (int i = (row - 2); i >= 0; i--) {
            for (int j = (row - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
