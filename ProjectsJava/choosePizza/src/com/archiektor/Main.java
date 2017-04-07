package com.archiektor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        String name;

        name = "Наташа";

        System.out.println("Привет " + name + ", давай-ка сделаем наконец этот сложный выбор и пойдем смотреть тот классный фильм !");

        Pizza pizza1 = new Pizza();
        pizza1.choose();

        System.out.println("Спасибо Вам за внимание...и...приятного аппетита !");

    }


}
