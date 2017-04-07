package com.archiektor;

/**
 * Created by Archiektor on 04.02.2017.
 */
public class Player {

    String name;

    int greateNumber() {
        int guessNumber = (int) (Math.random() * 15);
        System.out.println(name + " загадал " + guessNumber);
        return guessNumber;
    }

}
