package com.ayse.condition;

import java.util.Scanner;

/**
 * If the password is incorrect, ask the user if they want to reset their password.
 * If the user wants to reset it, check that the new password entered is not the same as the incorrect or forgotten password.
 * If the passwords are the same, display "Password could not be created, please enter another password."
 * If there is no issue, display "Password created."
 *
 * @author aysedemirel
 */
public class Login {

    private static final String CORRECT_USERNAME = "Ayse";
    private static final String CORRECT_PASSWORD = "123";
    private final String userName;
    private final Scanner scanner;
    private String password;

    public Login() {
        scanner = new Scanner(System.in);
        System.out.print("Username:");
        userName = scanner.nextLine();
        System.out.print("Password:");
        password = scanner.nextLine();
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.checkInfo();
    }

    public void checkInfo() {
        boolean isUsernameCorrect = userName.equals(CORRECT_USERNAME);
        boolean isPasswordCorrect = password.equals(CORRECT_PASSWORD);
        if (isUsernameCorrect && isPasswordCorrect) {
            System.out.println("Successful login...");
        } else {
            System.out.print("Fail login --> ");
            if (!isUsernameCorrect) {
                System.out.print(" - username");
            }
            if (!isPasswordCorrect) {
                System.out.print(" - password");
            }
            changePasswordControl();
        }
    }

    private void changePasswordControl() {
        System.out.println("\n ------------- ");
        System.out.println("Would you like to reset your password (y/n) ?");
        boolean isExit = false;
        while (!isExit) {
            char selection = scanner.nextLine().charAt(0);
            if (selection == 'y') {
                changePassword(CORRECT_PASSWORD);
                System.out.println("Exit...");
                isExit = true;
            } else if (selection == 'n') {
                System.out.println("Exit...");
                isExit = true;
            }
        }
    }

    public void changePassword(String oldPassword) {
        System.out.print("New password: ");
        boolean isPasswordChanged = false;
        while (!isPasswordChanged) {
            password = scanner.nextLine();
            if (password.equals(oldPassword) || password.equals(CORRECT_PASSWORD)) {
                System.out.println(
                        "The new password cannot be the same as the old password or the last entered password. Please enter a new one:");
            } else {
                System.out.println("New password changed");
                isPasswordChanged = true;
            }
        }
    }
}
