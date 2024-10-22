package com.ayse.condition.calculator;

import java.util.Scanner;

/**
 * Basic calculator for (+)(-)(/)(*) and integer numbers
 *
 * @author aysedemirel
 */
public class Calculator {
    private final int firstNumber;
    private final int secondNumber;
    private final Operations operation;

    public Calculator() {
        System.out.println("Please enter two number to calculate...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number:");
        firstNumber = scanner.nextInt();
        System.out.print("Operation (+)(-)(/)(*) :");
        operation = Operations.getOperationEnum(scanner.next().charAt(0));
        System.out.print("Second number:");
        secondNumber = scanner.nextInt();
        scanner.close();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculateResult();
    }

    public void calculateResult() {
        System.out.print("Result:");
        switch (operation) {
            case ADDITION -> System.out.println(firstNumber + secondNumber);
            case SUBTRACTION -> System.out.println(firstNumber - secondNumber);
            case MULTIPLY -> System.out.println(firstNumber * secondNumber);
            case DIVIDE -> {
                if (secondNumber == 0) {
                    System.out.println("The second number cannot be equal to zero");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
            }
            default -> System.out.println("The operation type you entered did not match with (+)(-)(/)(*)");

        }
    }
}
