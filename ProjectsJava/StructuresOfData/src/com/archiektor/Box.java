package com.archiektor;

/**
 * Created by Archiektor on 03.04.2017.
 */
public class Box<Integer> {
    private java.lang.Integer t;

    public void set(java.lang.Integer t) {
        this.t = t;
    }

    public java.lang.Integer get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}
