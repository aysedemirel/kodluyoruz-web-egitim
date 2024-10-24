package com.ayse.loop;

import java.util.Scanner;

/**
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı
 * yazıyoruz.
 * <p>
 * Print the powers of 4 and 5 up to the entered number using Java loops.
 *
 * @author aysedemirel
 */
public class PrintNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.print(i + " - ");
            }
        }
        scanner.close();
    }
}
