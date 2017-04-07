package com.archiektor;

/**
 * Created by Archiektor on 21.02.2017.
 */
public class StaticTests extends StaticSuper {

    static int rand;

    static {
        rand = (int) (Math.random()*6);
        System.out.println("Статический блок " + rand);
    }

    StaticTests (){
        System.out.println("Конструктор");
    }
}
