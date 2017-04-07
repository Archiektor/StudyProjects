package com.archiektor;

/**
 * Created by Archiektor on 22.02.2017.
 */
public class OuterClass {

    private int x;

    InnerClass inner = new InnerClass();

    public void doStuff() {
        inner.go();
        System.out.println(x);
    }

    class InnerClass {
        public int go() {
            x = 42;
            return x;
        }
    }
}
