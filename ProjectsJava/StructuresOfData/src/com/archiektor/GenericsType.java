package com.archiektor;

/**
 * Created by Archiektor on 03.04.2017.
 */
public class GenericsType<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;

    }
}
