package com.ayse.excp;

/**
 * Throw an exception if the age is less than 23. PersonException class is extended from the Exception class.
 *
 * @author aysedemirel
 * @see PersonException
 */
public class Person {

    private final String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person("Ayse");
        try {
            person.setAge(20);
        } catch (PersonException e) {
            System.out.println("PersonException");
            e.printStackTrace();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PersonException {
        if (age < 23) {
            throw new PersonException(age);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

}
