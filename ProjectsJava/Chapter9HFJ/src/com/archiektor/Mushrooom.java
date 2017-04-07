package com.archiektor;

/**
 * Created by Archiektor on 20.02.2017.
 */
public class Mushrooom {

    private int size;

    public int x = 0;

    public Mushrooom() {
        this.size = 27;
    }

    public Mushrooom(int size) {
        this.size = size;
    }

    public Mushrooom(boolean isMagic) {

    }

    public Mushrooom(boolean isMagic, int size) {

    }

    public int count() {
        x += 3;
        return x;
    }


}
