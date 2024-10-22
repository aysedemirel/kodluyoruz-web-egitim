package com.ayse.condition;

import java.util.Scanner;

/**
 * Get the height and weight values from the user and assign them to a variable.
 * Calculate the user's "Body Mass Index" value according to the formula below and
 * print it on the screen.
 * Formula: body mass index = weight(kg) / height(m) * height(m)
 *
 * @author aysedemirel
 */
public class BodyMass {

    private final double height;
    private final double weight;

    public BodyMass() {
        System.out.println("Please enter your body measurements");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height(m):");
        height = scanner.nextDouble();
        System.out.print("Weight(kg):");
        weight = scanner.nextDouble();
    }

    public static void main(String[] args) {
        BodyMass bodyMass = new BodyMass();
        bodyMass.calculateBodyMassIndex();
    }

    public void calculateBodyMassIndex() {
        double bodyMass = weight / (height * height);
        System.out.println("Body mass: " + bodyMass);
    }
}
