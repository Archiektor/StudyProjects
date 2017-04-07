package com.archiektor;

import java.util.ArrayList;

abstract class Animal {
    private String picture;
    public String food;
    public boolean hunger;
    public int boundaries;
    private String location;
    private String name;

    public void makeNoise() {
        System.out.println("Noising !!!");
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("Sleeping !!!");
    }

    public void roar() {
        System.out.println("Roaring Abbrrrr !!!");
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location.length() >= 4) {
            this.location = location;
        } else {
            System.out.println("You're put unsupported location !");
        }
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        //dog1.eat();

        Animal aHippo = new Hippo();

        Object bHippo = new Hippo();

        Cat cat1 = new Cat();

        cat1.setName("Vasya");
        //System.out.println(cat1.toString());

        ArrayList<Object> arrayList = new ArrayList<Object>();

        arrayList.add(cat1);

        Object unknown = new Object();

        // ????? !!!!!
        if (unknown instanceof Cat) {
            System.out.println("Bravo");
            Cat cat2 = (Cat) arrayList.get(0);
            System.out.println(cat2.getName());
        }

        /*Canine canine1 = new Canine();

        canine1.eat();*/



        /*if (dog1.equals(cat1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }*/

        //Animal animal = new Animal();
        // write your code her
        /*Feline feline = new Feline();
        feline.roar();

        feline.setLocation("Sahara");
        System.out.println(feline.getLocation());*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

