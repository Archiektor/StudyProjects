package com.archiektor;

/**
 * Created by Archiektor on 21.02.2017.
 */
public class Zero {

    private int z;

    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            z = a / b;
            return z;
        }
    }

}
