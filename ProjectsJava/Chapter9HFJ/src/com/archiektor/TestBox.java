package com.archiektor;

import java.util.Date;

/**
 * Created by Archiektor on 20.02.2017.
 */
public class TestBox {

    Integer i = 15;
    int j = 154;

    Date today = new Date();

    public void go() {
        System.out.println(Integer.toString(j));

        System.out.println(String.format("%td %<tB, %<tr", today));
    }
}
