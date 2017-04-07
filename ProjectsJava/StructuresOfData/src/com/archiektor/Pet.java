package com.archiektor;

import java.util.List;

/**
 * Created by Archiektor on 02.04.2017.
 */
public abstract class Pet {
    private String name;

    public static void init(List<Pet> list) {
        list.add(new Cat());
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.toString());
    }
}
