package com.ayse.method;

import java.util.Scanner;

/**
 * We are creating a calculator that performs operations selected by the user in Java.
 * <p>
 * 1- Addition 2- Subtraction 3- Multiplication 4- Division 5- Exponential Calculation 6-
 * Factorial Calculation 7- Modulus 8- Rectangle Area and Perimeter Calculation
 * <p>
 * Add methods for modulus and rectangle area and perimeter calculation to the same project and make them functional in the menu.
 *
 * @author aysedemirel
 */
public class ComplexCalculator {

    private final Scanner scanner;

    public ComplexCalculator() {
        scanner = new Scanner(System.in);
        int select;
        String menu = """
                1- Addition calculation
                2- Subtraction calculation
                3- Multiplication calculation
                4- Division calculation
                5- Exponential calculation
                6- Factorial calculation
                7- Mode calculation
                8- Rectangular area and perimeter calculation
                0- Exit
                """;
        do {
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            select = scanner.nextInt();
            switch (select) {
                case 1 -> System.out.println("ADDITION: " + addition());
                case 2 -> System.out.println("SUBTRACTION: " + subtraction());
                case 3 -> System.out.println("MULTIPLICATION: " + multiplication());
                case 4 -> System.out.println("DIVISION: " + division());
                case 5 -> System.out.println("EXPONENTIAL: " + exponential());
                case 6 -> System.out.println("FACTORIAL: " + factorial());
                case 7 -> System.out.println("MODE: " + mode());
                case 8 -> {
                    System.out.println(
                            "Please enter two edges to calculate rectangular area and perimeter: ");
                    System.out.print("Edge 1: ");
                    int edge1 = scanner.nextInt();
                    System.out.print("Edge 1: ");
                    int edge2 = scanner.nextInt();
                    System.out.println("AREA: " + rectangularArea(edge1, edge2));
                    System.out.println("PERIMETER: " + rectangularPerimeter(edge1, edge2));
                }
                default -> System.out.println("Invalid operation!");
            }
        } while (select != 0);
    }

    public static void main(String[] args) {
        new ComplexCalculator();
    }

    private int addition() {
        System.out.println(
                "Please enter the numbers that you want to get a result (please enter 0 to finish): ");
        int number;
        int sum = 0;
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        return sum;
    }

    private int subtraction() {
        System.out.println(
                "Please enter the numbers that you want to get a result (please enter 0 to finish): ");
        int number;
        int result = 0;
        int i = 0;
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (i == 0) {
                result = number;
                i++;
            } else {
                result -= number;
            }
        }
        return result;
    }

    private int multiplication() {
        System.out.println(
                "Please enter the numbers that you want to get a result (please enter 1 to finish): ");
        int number;
        int result = 1;
        while (true) {
            number = scanner.nextInt();
            if (number == 1) {
                break;
            }
            result *= number;
        }
        return result;
    }

    private int division() {
        System.out.println(
                "Please enter the numbers that you want to get a result (please enter 1 to finish): ");
        int number;
        int result = 1;
        int i = 0;
        while (true) {
            number = scanner.nextInt();
            if (number == 1) {
                break;
            }
            if (i == 0) {
                result = number;
                i++;
            } else {
                result /= number;
            }
        }
        return result;
    }

    private int exponential() {
        System.out.print("Base: ");
        int base = scanner.nextInt();
        System.out.print("Power: ");
        int power = scanner.nextInt();
        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }

    private int factorial() {
        System.out.print("Please enter the number to find the factorial: ");
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private int mode() {
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        return (num1 % num2);
    }

    private int rectangularArea(int edge1, int edge2) {
        return edge1 * edge2;
    }

    private int rectangularPerimeter(int edge1, int edge2) {
        return 2 * (edge1 + edge2);
    }
}
