package com.archiektor;

/**
 * Created by Archiektor on 04.04.2017.
 */
public class Q {
    private int n;
    private boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Added " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void set(int n) {
        while (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Setted " + n);
        notify();
    }
}
