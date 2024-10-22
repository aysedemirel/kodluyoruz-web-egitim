package com.ayse.condition.triangle;

import java.util.Scanner;

/**
 * Calculate the area of a triangle using the formula below:
 * Triangle area = 2𝑢
 * 𝑢 = (a+b+c) / 2
 * Area * Area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 *
 * @author aysedemirel
 */
public class CalculateTriangleArea {

    private final int edge1;
    private final int edge2;
    private final int edge3;

    public CalculateTriangleArea() {
        System.out.println("Please enter edges of the triangle");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edge 1: ");
        edge1 = scanner.nextInt();
        System.out.print("Edge 2: ");
        edge2 = scanner.nextInt();
        System.out.print("Edge 3: ");
        edge3 = scanner.nextInt();
    }

    public static void main(String[] args) {
        CalculateTriangleArea calculateTriangleArea = new CalculateTriangleArea();
        calculateTriangleArea.calculateArea();
    }

    public void calculateArea() {
        double perimeter = (edge1 + edge2 + edge3) / 2.0;
        double area = Math.sqrt(
                perimeter * (perimeter - edge1) * (perimeter - edge2) * (perimeter - edge3));
        System.out.println("Area of the triangle: " + area);
    }
}
