package com.hfad.chapter3android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    //public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent1 = getIntent();
        String receivedMessage = intent1.getStringExtra(Intent.EXTRA_TEXT);

        TextView textOnScreen = (TextView) findViewById(R.id.textView);
        textOnScreen.setText(receivedMessage);
    }

    /*public void ReceiveMessage(Intent intent) {
        Intent intent1 = getIntent();

        String receivedMessage = intent1.getStringExtra("MessageToSend");

        TextView textOnScreen = (TextView) findViewById(R.id.textView);

        textOnScreen.setText(receivedMessage);

    }*/
}
