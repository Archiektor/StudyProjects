package com.example.nikki.androidpvt2908resources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTextView = (TextView) findViewById(R.id.textView1);

        String zero = getResources().getQuantityString(R.plurals.account_counter, 0);
        String one = getResources().getQuantityString(R.plurals.account_counter, 1, 1);
        String one31 = getResources().getQuantityString(R.plurals.account_counter, 31, 31);
        String few = getResources().getQuantityString(R.plurals.account_counter, 3, 3);
        String many = getResources().getQuantityString(R.plurals.account_counter, 350, 350);

        System.out.println();
    }
}

