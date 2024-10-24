package com.ayse.collectionmap.treeset;

import java.util.TreeSet;

/**
 * Print name and age of students in ascending order of age and descending order of name.
 *
 * @author aysedemirel
 * @see OrderAgeComparator
 * @see OrderNameComparator
 * @see Student
 */
public class TreeSetExampleMain {

    public static void main(String[] args) {
        TreeSet<Student> ageOrder = new TreeSet<>(new OrderAgeComparator());
        ageOrder.add(new Student("Mustafa", 32));
        ageOrder.add(new Student("Ayse", 22));
        ageOrder.add(new Student("Ahmet", 52));
        for (Student s : ageOrder) {
            System.out.println(s.getName() + " - " + s.getAge());
        }
        System.out.println("-----------------------------------");
        TreeSet<Student> nameOrder = new TreeSet<>(new OrderNameComparator());
        nameOrder.add(new Student("Mustafa", 32));
        nameOrder.add(new Student("Ayse", 22));
        nameOrder.add(new Student("Ahmet", 52));
        for (Student s : nameOrder) {
            System.out.println(s.getName() + " - " + s.getAge());
        }
        System.out.println("-----------------------------------");
        TreeSet<Integer> number = new TreeSet<>();
        number.add(10);
        number.add(1002);
        number.add(-2);
        number.add(25);
        for (Integer s : number) {
            System.out.println(s);
        }
    }

}
