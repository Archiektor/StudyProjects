package com.archiektor;

/**
 * Created by Archiektor on 04.04.2017.
 */
public class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Postavschik").start();
    }

    @Override
    public void run() {
        int i = 0;

        do {
            q.set(i++);
        } while (i < 10);
    }
}
