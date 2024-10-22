package com.ayse.condition;

import java.util.Scanner;

/**
 * Write a program that calculates the area and perimeter of a circle when the radius is taken from the user.
 * Area Formula: π * r * r; Perimeter Formula: 2 * π * r;
 * Write a program that finds the area of a circle segment with radius r and central angle 𝛼.
 * Formula: (π * (r * r) * 𝛼) / 360
 *
 * @author aysedemirel
 */
public class Circle {

    private final double radius;
    private final double centerAngle;

    public Circle() {
        System.out.println("Please enter radius and center angle of the circle");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        radius = scanner.nextDouble();
        System.out.print("Center angle: ");
        centerAngle = scanner.nextDouble();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.calculateSliceArea();
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter: " + perimeter);
    }

    public void calculateSliceArea() {
        double sliceArea = (Math.PI * (radius * radius) * centerAngle) / 360;
        System.out.println("Slice area: " + sliceArea);
    }
}
