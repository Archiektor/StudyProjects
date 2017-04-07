package com.archiektor;

/**
 * Created by Archiektor on 04.04.2017.
 */
public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Potrebitel ").start();
    }

    @Override
    public void run() {
        do {
            q.get();
        } while (true);
    }
}
