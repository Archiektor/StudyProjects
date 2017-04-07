package com.archiektor;

public class DogTestDrive {

    public static void main(String[] args) {
        Dog d1 = new Dog("Alex");

        Dog d2 = new Dog();
        d2.name = "Nikko";

        d1.bark();

        d2.bark();

        System.out.println("///////////////");

        d2 = d1;

        //d1 = null;

        d2.bark();
        d1.bark();
    }
}
