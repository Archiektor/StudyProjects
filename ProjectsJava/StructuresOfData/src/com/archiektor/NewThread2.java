package com.archiektor;

/**
 * Created by Archiektor on 04.04.2017.
 */
public class NewThread2 extends Thread {
    NewThread2 t;

    NewThread2(String name) {
        super(name);
        System.out.println("Support thread is created " + this);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Support thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Support thread " + " interrupted");
            }

        }
        System.out.println("Support thread " + " ended");
    }
}
