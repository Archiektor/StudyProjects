package com.archiektor;

public class CatTestDrive {

    public static void main(String[] args) {
        // write your code here

        Cat cat1 = new Cat();

        int[] mass = cat1.sum(5, 7, 9);
        System.out.println(mass[0] + mass[1] + mass[2]);


        /*Cat cat1 = new Cat();
        cat1.setName("Alice");
        cat1.setSize(15);

        Cat cat2 = new Cat();
        cat2.setSize(cat1.getSize() - 10);
        cat2.setName("Bagira");

        System.out.println(cat1.getName() + " " + cat2.getName());
        System.out.println(cat1.meow(cat1.getSize()));
        System.out.println(cat2.meow(cat2.getSize()));*/
    }
}
