package com.archiektor;

/**
 * Created by Archiektor on 04.02.2017.
 */
public class Dog {

    String name;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    void bark() {
        System.out.println("Dog " + name + " how - how !");
    }


}
