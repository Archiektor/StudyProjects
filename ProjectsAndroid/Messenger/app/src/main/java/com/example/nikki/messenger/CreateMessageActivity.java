package com.example.nikki.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);


    }

    public void onSendMessage(View view) {
        TextView message = (TextView) findViewById(R.id.message);
        String sendMessage = message.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, sendMessage);

        String nameOfChooser = getString(R.string.chooser);

        Intent chosenIntent = Intent.createChooser(intent, nameOfChooser);

        startActivity(chosenIntent);

    }
}
