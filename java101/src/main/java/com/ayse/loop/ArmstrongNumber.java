package com.ayse.loop;

import java.util.Scanner;

/**
 * If the sum of the n-th powers of the digits of an n-digit number is equal to the number itself, such
 * numbers are called Armstrong numbers.
 * <p>
 * For example, let's consider the number 407. (4^3) + (0^3) + (7^3) = 64 + 0 + 343 = 407. This shows that 407
 * is an Armstrong number.
 * <p>
 * Let's also look at the number 1342. (1^4) + (3^4) + (4^4) + (2^4) = 1 + 81 + 256 + 16 = 354, which is not
 * equal to 1342, so it is not an Armstrong number.
 * <p>
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
 * <p>
 * 54748 = 5^5 + 4^5 + 7^5 + 4^5 + 8^5 = 3125 + 1024 + 16807 + 1024 + 32768 = 54748
 *
 * @author aysedemirel
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        long number = scanner.nextLong();
        calculateArmstrong(number);
        sumAllDigits(number);
        scanner.close();
    }

    private static void calculateArmstrong(long number) {
        long temp = number;
        long result = 0;
        long digitNumber = getDigitNumber(number);
        while (temp >= 1) {
            long digit = temp - (temp / 10 * 10);
            temp /= 10;
            result += (long) Math.pow(digit, digitNumber);
        }
        if (result == number) {
            System.out.println("Armstrong number...");
        } else {
            System.out.println("Not armstrong number...");
        }
    }

    private static void sumAllDigits(long number) {
        long temp = number;
        long result = 0;
        while (temp >= 1) {
            long digit = temp - (temp / 10 * 10);
            temp /= 10;
            result += digit;
        }
        System.out.println("Sum of all digits: " + result);
    }

    private static long getDigitNumber(long number) {
        long temp = number;
        long digitNum = 0;
        while (temp >= 1) {
            temp /= 10;
            digitNum++;
        }
        return digitNum;
    }
}
