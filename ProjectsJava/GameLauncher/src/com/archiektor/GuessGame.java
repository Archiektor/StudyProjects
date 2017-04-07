package com.archiektor;

/**
 * Created by Archiektor on 04.02.2017.
 */
public class GuessGame {

    int targetNumber = (int) (Math.random() * 10);

    boolean win = false;

    void startGame() {
        while (win == false) {
            System.out.println("targetNumber = " + targetNumber);
            Player p1 = new Player();
            p1.name = "Player 1";
            int p1Number = p1.greateNumber();
            Player p2 = new Player();
            p2.name = "Player 2";
            int p2Number = p2.greateNumber();
            Player p3 = new Player();
            p3.name = "Player 3";
            int p3Number = p3.greateNumber();

            if (p1Number == targetNumber || p2Number == targetNumber || p3Number == targetNumber) {
                win = true;
                System.out.println("Players has won");
            }
        }
    }
}
