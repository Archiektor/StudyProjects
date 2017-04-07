package com.archiektor;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Calendar;

public class Main {

    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        // write your code here

        Calendar c = Calendar.getInstance();

        c.set(2004, 0, 7, 15, 40);

        long day1 = c.getTimeInMillis();

        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("Полнулуние было в %tc", c));
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
        }



        /*System.out.println("Внутри main");

        StaticTests st = new StaticTests();*/
    }
}
