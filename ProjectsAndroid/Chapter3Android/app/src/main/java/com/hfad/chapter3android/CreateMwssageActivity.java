package com.hfad.chapter3android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMwssageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mwssage);
    }

    public void onSendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        //good practice
        String sendMessage = editText.getText().toString();
        //bad practice
        //String sendMessage = String.valueOf(findViewById(R.id.editText));

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, sendMessage);

        intent.putExtra(Intent.EXTRA_SUBJECT, "New Message");

        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);

        //Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, sendMessage);
        //startActivity(intent);
    }
}
