package com.example.nikki.androidpvtvalues0209;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);

        //System.out.println("lalsda");
    }

    @Override
    protected void onStart() {
        super.onStart();

        LinearLayout mlLayout = (LinearLayout) findViewById(R.id.linearLayout);
        int width = mlLayout.getWidth();
        int height = mlLayout.getHeight();
        //какой-то тупой метод...displaymetrics круче
        TextView txt = (TextView) findViewById(R.id.textView);
        txt.setText("\n" + "width : " + width + "\n" + "height : " + height);

        /*StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = getResources().getStringArray(R.array.media_names);

        for (int i = 0; i < stringArray.length; i++) {
            stringBuilder.append(stringArray[i] + "\n");
            txt.setText(stringBuilder);
        }


        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        stringBuilder.append("\n" + "width : " + width + "\n" + "height : " + height);
        txt.setText(stringBuilder);*/

    }
}
