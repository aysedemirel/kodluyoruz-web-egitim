package com.ayse.condition.gradeaverage;

import java.util.Scanner;

/**
 * Get the exam scores of
 * Math, Physics, Chemistry, Turkish, History, Music courses from the user,
 * calculate their averages and print them on the screen.
 * Using conditional statements in the same program,
 * if the user's average is greater than 60, it should print "Passed the Class",
 * if it is less, it should print "Failed the Class".
 * <br/>
 * Note: If and Else will not be used...
 *
 * @author aysedemirel
 */
public class GradeAverage {
    private static final double NUMBER_OF_CLASSES = 6.0;
    private final int math;
    private final int physic;
    private final int chemistry;
    private final int turkish;
    private final int history;
    private final int music;

    public GradeAverage() {
        System.out.println("Please enter your grades");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Math: ");
        math = scanner.nextInt();
        System.out.print("Physic: ");
        physic = scanner.nextInt();
        System.out.print("Chemistry: ");
        chemistry = scanner.nextInt();
        System.out.print("Turkish: ");
        turkish = scanner.nextInt();
        System.out.print("History: ");
        history = scanner.nextInt();
        System.out.print("Music: ");
        music = scanner.nextInt();
    }

    public static void main(String[] args) {
        GradeAverage gradeAverage = new GradeAverage();
        gradeAverage.printResult();
    }

    public void printResult() {
        double average = (math + physic + chemistry + turkish + history + music) / NUMBER_OF_CLASSES;
        System.out.println("average: " + average);
        System.out.println((average > 60) ? "Passed class" : "Failed class");
    }
}
