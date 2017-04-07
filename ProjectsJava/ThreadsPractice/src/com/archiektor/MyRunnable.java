package com.archiektor;

/**
 * Created by Archiektor on 02.03.2017.
 */
public class MyRunnable implements Runnable {

    private String name;

    @Override
    public void run() {
        name = Thread.currentThread().getName();
        print(name);
    }

    public synchronized void print(String name) {
        try {
            for (int i = 0; i < 3; i++) {
                this.name = name;
                System.out.println(name + " - " + i);
                Thread.sleep(500);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
