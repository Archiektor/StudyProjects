package com.archiektor;

/**
 * Created by Archiektor on 21.02.2017.
 */
public class StaticSuper {

    static {
        System.out.println("Родительский статический блок");
    }

    StaticSuper() {
        System.out.println("Родительский конструктор");
    }
}
