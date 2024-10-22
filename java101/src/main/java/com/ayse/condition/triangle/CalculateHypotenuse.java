package com.ayse.condition.triangle;

import java.util.Scanner;

/**
 * Calculate hypotenuse of a right triangle by given edges of triangle by user input
 *
 * @author aysedemirel
 */
public class CalculateHypotenuse {

    private final int edge1;
    private final int edge2;

    public CalculateHypotenuse() {
        System.out.println("Please enter edges of triangle");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edge 1: ");
        edge1 = scanner.nextInt();
        System.out.print("Edge 2: ");
        edge2 = scanner.nextInt();
    }

    public static void main(String[] args) {
        CalculateHypotenuse calculateHypotenuse = new CalculateHypotenuse();
        calculateHypotenuse.calculateHypo();
    }

    public void calculateHypo() {
        double hypo = Math.sqrt((edge1 * edge1) + (edge2 * edge2));
        System.out.println("Hypotenuse: " + hypo);
    }

}
