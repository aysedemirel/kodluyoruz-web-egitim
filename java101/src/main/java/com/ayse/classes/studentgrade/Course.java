package com.ayse.classes.studentgrade;

/**
 * Every course has a name, code, prefix, extraGrade, examGrade, and teacher for a student.
 */
public class Course {

    private final String name;
    private final String code;
    private final String prefix;
    private int extraGrade;
    private int examGrade;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examGrade = 0;
        this.extraGrade = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (prefix.equals(teacher.getBranch())) {
            System.out.println("Success - addTeacher(): " + teacher.getName());
        } else {
            System.out.println(teacher.getName() + " can't give the course");
        }
    }

    public int getAverage(double extraPer) {
        return (int) (extraGrade * extraPer + examGrade * (1 - extraPer));
    }

    public int getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(int examGrade) {
        this.examGrade = examGrade;
    }

    public void setExtraGrade(int extraGrade) {
        this.extraGrade = extraGrade;
    }
}
