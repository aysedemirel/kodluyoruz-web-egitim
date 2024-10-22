package com.ayse.condition.horoscope;

import java.util.Scanner;

/**
 * Calculating the Chinese zodiac is done by dividing the person's birth year by 12
 * and taking the remainder. The remainder is the Chinese zodiac sign.
 *
 * @author aysedemirel
 */
public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birth year: ");
        int birthYear = scanner.nextInt();
        calculateZodiac(birthYear);
    }

    private static void calculateZodiac(int birthYear) {
        int type = birthYear % 12;
        ChineseZodiacTypes zodiac = ChineseZodiacTypes.getType(type);
        System.out.println("Zodiac: " + zodiac);
    }
}
