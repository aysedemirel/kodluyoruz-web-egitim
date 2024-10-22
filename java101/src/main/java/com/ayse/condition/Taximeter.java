package com.ayse.condition;

import java.util.Scanner;

/**
 * Write a program that prints the taximeter fare to the screen based on the distance traveled (KM).
 * The taximeter charges 2.20 TL per KM. The minimum payable amount is 20 TL.
 * For fees below 20 TL, 20 TL will still be charged. The taximeter starting fee is 10 TL.
 *
 * @author aysedemirel
 */
public class Taximeter {

    private static final double PER_KM = 2.20;
    private static final double START_PRICE = 10.0;

    public static void main(String[] args) {
        System.out.print("Please enter the distance(km): ");
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        calculateFee(distance);
        scanner.close();
    }

    private static void calculateFee(double distance) {
        double price = START_PRICE + distance * PER_KM;
        double result = (price < 20) ? 20 : price;
        System.out.println("Total fee: " + result);
    }
}
