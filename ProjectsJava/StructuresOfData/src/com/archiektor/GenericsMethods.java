package com.archiektor;

import java.util.List;

/**
 * Created by Archiektor on 03.04.2017.
 */
public class GenericsMethods {

    public static void printData(List<? super Integer> list) {
        for (Object obj : list) {
            System.out.println(obj.getClass().getName());
        }
    }
}
