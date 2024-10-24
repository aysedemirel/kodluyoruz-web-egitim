package com.ayse.loop;

/**
 * Write a program in Java that prints prime numbers between 1 and 100 on the screen.
 * <p>
 * result: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 *
 * @author aysedemirel
 */
public class PrimeNumber {

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int result = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result++;
                    break;
                }
            }
            if (result == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
