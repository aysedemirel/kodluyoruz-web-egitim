package com.ayse.condition;

import java.util.Scanner;

/**
 * As a general rule, leap years are years that are multiples of 4:
 * <br/>
 * For example, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024.
 * Among the years that are multiples of 100,
 * only those that can be divided by 400 without a remainder are leap years.
 * <br/>
 * For example, the years 1200, 1600, and 2000 are leap years, but 1700, 1800, and 1900 are not. The reason for accepting
 * only those that can be exactly divided by 400 as leap years is to correct the error caused by an astronomical year being
 * approximately 365.242 days instead of 365.25 days.
 * <br/>
 * 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 --> leap years
 * <br/>
 * The years 1200, 1600, and 2000 are leap years, but 1700, 1800, and 1900 are not.
 *
 * @author aysedemirel
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        calculateLeapYear(year);
    }

    private static void calculateLeapYear(int year) {
        int hundredfold = year % 400;
        int quadruple = year % 4;
        boolean isLeapYear = (quadruple == 0 && year % 100 != 0) || (hundredfold == 0);
        System.out.print(year + " is ");
        String result = isLeapYear ? "a leap year" : "not a leap year";
        System.out.println(result);
    }
}
