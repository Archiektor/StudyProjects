package com.archiektor;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by Archiektor on 04.04.2017.
 */
public class NewThread implements Runnable {
    Message message;
    Thread t;

    NewThread(String name) {
        t = new Thread(this, name);
        System.out.println("Support thread is created");
        t.start();
    }

    @Override
    public void run() {
        message = new Message("thread name is: " + t.getName());

            for (int i = 0; i < 3; i++) {
                message.showMessage();
                //Thread.sleep(100);
            }
    }
}
