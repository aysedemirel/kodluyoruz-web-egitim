package com.ayse.classes.studentgrade;

/**
 * Enter an extra grade in each Course and calculate its effect on the average for each course separately.
 * Include the extra grades with the percentage of their effect on the average.
 * <br/>
 * For example:
 * If the extra grade of the physics course has a 20% effect on the average,
 * the effect of the exam grade is 80%.
 * If the student received a 90 in the extra grade and a 60 in the exam,
 * the effect of that course on the general average is calculated as follows:
 * <br/>
 * Physics Average: (90 * 0.20) + (60 * 0.80);
 */
public class StudentGradeMain {

    public static void main(String[] args) {

        Course math = new Course("Math", "MAT101", "MAT");
        Course physic = new Course("Physic", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHM101", "CHM");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "PHY");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHM");

        math.addTeacher(t1);
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("inek saban", 4, "140144015", math, physic, chemistry);
        s1.addBulkExamNote(50, 90, 40);
        s1.addBulkExtraNote(60, 60, 40);
        s1.isPass();

        Student s2 = new Student("guduk necmi", 4, "2211133", math, physic, chemistry);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkExtraNote(60, 30, 40);
        s2.isPass();

        Student s3 = new Student("hayta ismail", 4, "221121312", math, physic, chemistry);
        s3.addBulkExamNote(50, 20, 40);
        s3.addBulkExtraNote(60, 30, 40);
        s3.isPass();
    }
}
