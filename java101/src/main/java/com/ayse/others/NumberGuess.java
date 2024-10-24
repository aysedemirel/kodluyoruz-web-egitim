package com.ayse.others;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Write a "Number Guessing Game" where the program randomly selects a number between 0-100 and the user tries to guess it.
 *
 * @author aysedemirel
 */
public class NumberGuess {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        guess(randomNumber);
        // patikaGuess(randomNumber);
    }

    private static void guess(int randomNumber) {
        int right = 5;
        int number;
        Scanner scanner = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Guess (between 0-100) : ");
            number = scanner.nextInt();
            if (number <= 0 || number >= 101) {
                right--;
                System.out.println("Please enter a valid number. Right: " + right);
            } else if (number != randomNumber) {
                right--;
                System.out.println("Wrong!!! Right: " + right);
                String hint = (number > randomNumber) ? "your number is greater than lucky number"
                        : "your number is lower than lucky number";
                System.out.println(hint);
            } else if (number == randomNumber) {
                System.out.println("WIN!!! Lucky number: " + number);
                break;
            }
            if (right == 0) {
                System.out.println("You don't have enough right to play..... number was: " + number);
            }
        }
    }

    private static void guess2(int randomNumber) {
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(randomNumber);
        while (right < 5) {
            System.out.print("Please enter your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("Too many invalid entries. Remaining rights: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your next invalid entry will reduce your rights.");
                }
                continue;
            }

            if (selected == randomNumber) {
                System.out.println("Congratulations, correct guess! The guessed number: " + randomNumber);
                isWin = true;
                break;
            } else {
                System.out.println("You entered an incorrect number!");
                if (selected > randomNumber) {
                    System.out.println(selected + " is greater than the secret number.");
                } else {
                    System.out.println(selected + " is less than the secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining rights: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost!");
            if (!isWrong) {
                System.out.println("Your guesses: " + Arrays.toString(wrong));
            }
        }

    }
}
