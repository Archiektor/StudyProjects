package com.archiektor;

/**
 * Created by Archiektor on 04.04.2017.
 */
public class ChickhenVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Chickhen first !");
        }
    }
}
