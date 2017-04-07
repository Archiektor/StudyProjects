package com.archiektor;

import java.util.ArrayList;

/**
 * Created by Archiektor on 07.02.2017.
 */

public class Main {


    public static void main(String[] args) {
        Main game = new Main();
        game.setUpGame();
        game.startPlaying();
    }

    private GameHelper helper = new GameHelper();
    private int numOfGuesses = 0;
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();


    private void setUpGame() {

        //dotComsList.isEmpty();


        //Greate a few sites and will name it
        DotCom one = new DotCom();
        one.setName("Go2.com");

        dotComsList.add(1, one);

        DotCom two = new DotCom();
        one.setName("Pets.com");
        DotCom three = new DotCom();
        one.setName("AskMe.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your main point - potopit 3 sites");
        System.out.println("");
        System.out.println("Try to potopit them in a few steps");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }


    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Make your step");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead!  Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

}
