package com.archiektor;

import java.io.Serializable;

/**
 * Created by Archiektor on 27.02.2017.
 */
public class Box implements Serializable {

    private int height;
    private int width;

    public void setHeight(int h) {
        height = h;
    }

    public void setWidth(int w) {
        width = w;
    }
}
