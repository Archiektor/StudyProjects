package com.archiektor;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MyRunnable r1 = new MyRunnable();

        Thread t1 = new Thread(r1);
        t1.setName("alpha");
        t1.start();

        Thread t2 = new Thread(r1);
        t2.setName("beta");
        t2.start();

    }
}
