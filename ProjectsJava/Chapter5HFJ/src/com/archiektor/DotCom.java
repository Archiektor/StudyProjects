package com.archiektor;

import java.util.ArrayList;

/**
 * Created by Archiektor on 05.02.2017.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    //int numOfHits = 0;
    private String name;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {

        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println(result);
            } else {
                result = "shoot";
                System.out.println(result);
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
        /*int guess = Integer.parseInt(stringGuess);

        for (int cell: locationCells)
        {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length)
        {
            result = "kill";
        }
        System.out.println(result);
        return result;*/

