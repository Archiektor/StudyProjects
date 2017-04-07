package com.archiektor;

/**
 * Created by Archiektor on 05.02.2017.
 */
public class Cat {

    private int size;

    private String meow;

    private String name;

    private int[] array = new int[3];

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Cat is too small");
        }
    }

    int[] sum(int x, int y, int z) {
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String meow(int size) {
        if (size > 10) {
            meow = "Meow meow !";
        } else {
            meow = "Maw maw ! tiny cat !";
        }
        return meow;
    }
}
