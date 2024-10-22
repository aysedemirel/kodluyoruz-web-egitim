package com.ayse.condition.horoscope;

import java.util.Scanner;

/**
 * Calculating the horoscope is mapping the month and day to the horoscope.
 *
 * @author aysedemirel
 */
public class HoroscopeFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day: ");
        int day = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        findHoroscope(day, month);
    }

    /**
     * Aquarius: January 22 - February 19
     * Pisces: February 20 - March 20
     * Aries: March 21 - April 20
     * Taurus: April 21 - May 21
     * Gemini: May 22 - June 22
     * Cancer: June 23 - July 22
     * Leo: July 23 - August 22
     * Virgo: August 23 - September 22
     * Libra: September 23 - October 22
     * Scorpio: October 23 - November 21
     * Sagittarius: November 22 - December 21
     * Capricorn: December 22 - January 21
     */
    private static void findHoroscope(int day, int month) {
        if (
                ((month == 12) && (day >= 22 && day <= 31)) ||
                        ((month == 1) && (day >= 1 && day <= 21))
        ) {
            System.out.println("Capricorn");
        } else if (
                ((month == 1) && (day >= 22 && day <= 31)) ||
                        ((month == 2) && (day >= 1 && day <= 19))
        ) {
            System.out.println("Aquarius");
        } else if (
                ((month == 2) && (day >= 20 && day <= 28)) ||
                        ((month == 3) && (day >= 1 && day <= 20))
        ) {
            System.out.println("Pisces");
        } else if (
                ((month == 3) && (day >= 21 && day <= 31)) ||
                        ((month == 4) && (day >= 1 && day <= 20))
        ) {
            System.out.println("Aries");
        } else if (
                ((month == 4) && (day >= 21 && day <= 30)) ||
                        ((month == 5) && (day >= 1 && day <= 21))
        ) {
            System.out.println("Taurus");
        } else if (
                ((month == 5) && (day >= 22 && day <= 31)) ||
                        ((month == 6) && (day >= 1 && day <= 22))
        ) {
            System.out.println("Gemini");
        } else if (
                ((month == 6) && (day >= 23 && day <= 30)) ||
                        ((month == 7) && (day >= 1 && day <= 22))
        ) {
            System.out.println("Cancer");
        } else if (
                ((month == 7) && (day >= 23 && day <= 31)) ||
                        ((month == 8) && (day >= 1 && day <= 22))
        ) {
            System.out.println("Leo");
        } else if (
                ((month == 8) && (day >= 23 && day <= 31)) ||
                        ((month == 9) && (day >= 1 && day <= 22))
        ) {
            System.out.println("Virgo");
        } else if (
                ((month == 9) && (day >= 23 && day <= 30)) ||
                        ((month == 10) && (day >= 1 && day <= 22))
        ) {
            System.out.println("Libra");
        } else if (
                ((month == 10) && (day >= 23 && day <= 31)) ||
                        ((month == 11) && (day >= 1 && day <= 21))
        ) {
            System.out.println("Scorpio");
        } else if (
                ((month == 11) && (day >= 22 && day <= 30)) ||
                        ((month == 12) && (day >= 1 && day <= 21))
        ) {
            System.out.println("Sagittarius");
        }
    }
}
