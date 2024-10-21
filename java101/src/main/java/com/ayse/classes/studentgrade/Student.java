package com.ayse.classes.studentgrade;

/**
 * Every student has a name, student number, class, and three courses.
 */
public class Student {

    private static final double MATH_EXTRA = 0.2;
    private static final double PHYSIC_EXTRA = 0.2;
    private static final double CHEMISTRY_EXTRA = 0.2;
    private final String name;
    private final int stuNo;
    private final String classes;
    private final Course math;
    private final Course physic;
    private final Course chemistry;
    private boolean isPass;
    private int average;

    public Student(String name, int stuNo, String classes, Course math, Course physic,
                   Course chemistry) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.isPass = false;
    }

    public void addBulkExamNote(int math, int physic, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.setExamGrade(math);
        }
        if (physic >= 0 && physic <= 100) {
            this.physic.setExamGrade(physic);
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.setExamGrade(chemistry);
        }
    }

    public void addBulkExtraNote(int math, int physic, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.setExtraGrade(math);
        }
        if (physic >= 0 && physic <= 100) {
            this.physic.setExtraGrade(physic);
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.setExtraGrade(chemistry);
        }
    }

    public void isPass() {
        if (math.getExamGrade() == 0 || physic.getExamGrade() == 0 || chemistry.getExamGrade() == 0) {
            System.out.println("No code is completed");
        } else {
            isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + average);
            if (isPass) {
                System.out.println("Pass... ");
            } else {
                System.out.println("Failed...");
            }
        }
    }

    private boolean isCheckPass() {
        calcAverage();
        return average > 55;
    }

    private void calcAverage() {
        average = (math.getAverage(MATH_EXTRA) + physic.getAverage(PHYSIC_EXTRA) + chemistry.getAverage(
                CHEMISTRY_EXTRA)) / 3;
    }

    private void printNote() {
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.math.getExamGrade());
        System.out.println("Physic Note : " + this.physic.getExamGrade());
        System.out.println("Chemistry Note : " + this.chemistry.getExamGrade());
    }
}
