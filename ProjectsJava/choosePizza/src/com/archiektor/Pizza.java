package com.archiektor;

/**
 * Created by Archiektor on 23.02.2017.
 */
public class Pizza {

    String pizza1 = "Гриль Хауз Пицца";
    String pizza2 = "ПИЦЦА ЧИЗБУРГЕР 32";
    String pizza3 = "Пепперони (на толстом тесте)";

    public void choose() throws InterruptedException {


        System.out.println("Сейчас умный компьютер автоматически определит вашу пиццу !");
        int number = (int) (Math.random() * 4);

        Thread.sleep(1000);

        if (number <= 1) {
            System.out.println("Сегодня Вам следует попробывать пиццу " + pizza1);
        } else {
            if (number == 2) {
                System.out.println("Сегодня Вам следует попробывать пиццу " + pizza2);
            } else {
                System.out.println("Сегодня Вам следует попробывать пиццу " + pizza3 + " ! Ха-ха..ты проиграла, детка");
            }
        }

        // s = new Scanner(System.in);
        //int a = s.nextInt();
    }
}
