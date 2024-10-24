package com.ayse.oop;

/**
 * Polymorphism Example with Java
 *
 * @author aysedemirel
 */
public class PolymorphismExample {

    public PolymorphismExample() {
        // Basic Example
        Cat cat = new Cat("Nasip");
        if (cat instanceof Cat) {
            System.out.println("This object is from the Cat class");
        }
        if (cat instanceof Animal) {
            System.out.println("This object is from the Animal class");
        }

        // Example with function
        Cat cat2 = new Cat("Nasip");
        Dog dog = new Dog("Zizu");
        Horse horse = new Horse("BoldPilot");
        Animal animal = new Animal("Turunç");

        speak(cat2);
        speak(dog);
        speak(horse);
        speak(animal);
    }


    public static void main(String[] args) {
        new PolymorphismExample();
    }

    private static void speak(Object object) {
        if (object instanceof Dog dogTest) {
            System.out.println(dogTest.speak());
        } else if (object instanceof Cat catTest) {
            System.out.println(catTest.speak());
        } else if (object instanceof Horse horseTest) {
            System.out.println(horseTest.speak());
        } else if (object instanceof Animal animalTest) {
            System.out.println(animalTest.speak());
        }
    }

    class Animal {

        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String speak() {
            return "Hayvan Konuşuyor...";
        }
    }

    class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        @Override
        public String speak() {
            return this.getName() + " is meowing...";
        }
    }

    class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }

        @Override
        public String speak() {
            return this.getName() + " is barking...";
        }
    }

    class Horse extends Animal {

        public Horse(String name) {
            super(name);
        }

        @Override
        public String speak() {
            return this.getName() + " is neighing...";
        }
    }
}
