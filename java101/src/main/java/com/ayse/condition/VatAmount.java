package com.ayse.condition;

import java.util.Scanner;

/**
 * Write a program that calculates and prints the VAT-inclusive price and
 * VAT amount of the value received from the user.
 * (Note: Take the VAT amount as 18%)
 * VAT-excluded Price = 10;
 * VAT-inclusive Price = 11.8;
 * VAT amount = 1.8;
 * <br/>
 * If the entered amount is between 0 and 1000 TL, the VAT rate is 18%,
 * if the amount is greater than 1000 TL, calculate the VAT amount with a VAT rate of 8%.
 *
 * @author aysedemirel
 */
public class VatAmount {
    private static final double VAT_PERCENTAGE_HIGH = 0.18;
    private static final double VAT_PERCENTAGE_LOW = 0.08;


    public static void main(String[] args) {
        System.out.print("Please enter the price without VAT: ");
        Scanner scanner = new Scanner(System.in);
        double priceWithoutVat = scanner.nextDouble();
        calculateVat(priceWithoutVat);
        scanner.close();
    }

    private static void calculateVat(double priceWithoutVat) {
        double vat =
                (priceWithoutVat > 0 && priceWithoutVat < 1000) ? VAT_PERCENTAGE_HIGH : VAT_PERCENTAGE_LOW;
        double result = priceWithoutVat + (priceWithoutVat * vat);
        System.out.println("Price with VAT (%" + vat * 100 + ") : " + result);
    }
}
