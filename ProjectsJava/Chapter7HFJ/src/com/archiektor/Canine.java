package com.archiektor;

/**
 * Created by Archiektor on 12.02.2017.
 */
public class Canine extends Animal implements Pet {

    public void roar() {
        super.roar();
        System.out.println("Roaring Canine !!!");
    }

    @Override
    public void eat() {

    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }
}
