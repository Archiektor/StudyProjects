package com.hfad.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //Call when the user click the button
    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands_of_beer);

        Spinner color = (Spinner) findViewById(R.id.colors_of_beer);
        String selectedColor = String.valueOf(color.getSelectedItem());

        String setText = showSortsOfBeer(selectedColor);

        brands.setText(setText);

    }

    public String showSortsOfBeer(String selectedColor) {

        String[] sortsOfBeer = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        switch (selectedColor) {
            case "light":
                String lightSorts;
                lightSorts = (String) (sortsOfBeer[0] + ";\n" + sortsOfBeer[1] + ";\n" + sortsOfBeer[2]);
                return lightSorts;
            case "amber":
                String amberSorts;
                amberSorts = (String) (sortsOfBeer[3] + ";\n" + sortsOfBeer[4] + ";\n" + sortsOfBeer[5]);
                return amberSorts;
            case "brown":
                String brownSorts;
                brownSorts = (String) (sortsOfBeer[6] + ";\n" + sortsOfBeer[7] + ";\n" + sortsOfBeer[8]);
                return brownSorts;
            case "dark":
                String darkSorts;
                darkSorts = (String) (sortsOfBeer[9] + ";\n" + sortsOfBeer[10] + ";\n" + sortsOfBeer[11]);
                return darkSorts;
            default:
                String error = new String();
                return error = "invalid type of beer";
        }
    }
}
