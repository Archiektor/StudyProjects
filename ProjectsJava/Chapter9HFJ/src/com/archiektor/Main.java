package com.archiektor;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Calendar c = Calendar.getInstance();

        c.getTime();

        long day1 = c.getTimeInMillis();

        System.out.println(c.getTime());

        c.add(c.DATE, 10);

        System.out.println("Добавить 10 дней " + c.getTime());
        //TestBox t = new TestBox();
        //t.go();

        //System.out.println(Math.abs(-423423));

        /*Mushrooom mushrooom1 = new Mushrooom();

        Mushrooom mushrooom2 = new Mushrooom(42);

        Mushrooom mushrooom3 = new Mushrooom(true);

        System.out.println("x = " + mushrooom1.count());*/

    }


}
