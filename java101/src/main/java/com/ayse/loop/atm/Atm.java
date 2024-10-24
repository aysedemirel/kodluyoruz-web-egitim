package com.ayse.loop.atm;

import java.util.Scanner;

/**
 * Username and password will be entered. 3 wrong attempts are allowed, otherwise the account will be blocked.
 *
 * @author aysedemirel
 */
public class Atm {

    private static final int MAX_RIGHT = 3;
    private static final int FIRST_BALANCE = 1500;
    private static final String USERNAME = "user1";
    private static final String PASSWORD = "password123";
    private final Scanner scanner = new Scanner(System.in);
    private int right = MAX_RIGHT;
    private int balance = FIRST_BALANCE;

    public Atm() {
        // ATM
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.enterSystem();
    }

    private void enterSystem() {

        while (right > 0) {
            System.out.print("Username: ");
            String sysUsername = scanner.nextLine();
            System.out.print("Password: ");
            String sysPassword = scanner.nextLine();
            boolean isUsernameAccepted = sysUsername.equals(USERNAME);
            boolean isPasswordAccepted = sysPassword.equals(PASSWORD);
            right--;

            if (!isUsernameAccepted) {
                System.out.println("Wrong username!!!");
            } else if (!isPasswordAccepted) {
                System.out.println("Wrong password!!!");
            } else {
                System.out.println("Welcome!!!");
                selectAccountOperations();
                right = 0;
            }

            if (!isPasswordAccepted || !isUsernameAccepted) {
                if (right == 0) {
                    System.out.println("Remaining right is zero. Your account is blocked...");
                } else {
                    System.out.println("Please try again... Remaining right: " + right);
                }
            }
        }
    }

    private void selectAccountOperations() {
        AccountOperations accountOperations;
        do {
            System.out.println("---------------\n" +
                    "0-Deposit\n" +
                    "1-Withdraw\n" +
                    "2-Balance inquiry\n" +
                    "3-Exit\n" +
                    "---------------");
            System.out.print("Please select account operation : ");
            accountOperations = AccountOperations.getOperation(scanner.nextInt());
            switch (accountOperations) {
                case DEPOSIT -> {
                    System.out.print("How much? (TL) :");
                    int price = scanner.nextInt();
                    balance += price;
                }
                case WITHDRAW -> {
                    System.out.print("How much? (TL) :");
                    int price = scanner.nextInt();
                    if (price > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= price;
                    }
                }
                case BALANCE_INQUIRY -> System.out.println("BALANCE : " + balance);
                case EXIT -> System.out.println("See you...");
                default -> System.out.println("Please select a valid operation.");
            }
        } while (accountOperations != AccountOperations.EXIT);
    }
}
