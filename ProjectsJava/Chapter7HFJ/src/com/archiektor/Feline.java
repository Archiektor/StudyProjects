package com.archiektor;

/**
 * Created by Archiektor on 12.02.2017.
 */
//should be abstract
public class Feline extends Animal implements Pet {


    @Override
    public void eat() {

    }

    public void roar() {
        super.roar();
        System.out.println("Roaring Feline !!!");
    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }
}
