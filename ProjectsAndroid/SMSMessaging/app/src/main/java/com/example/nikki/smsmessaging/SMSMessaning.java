package com.example.nikki.smsmessaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMSMessaning extends AppCompatActivity {

    //Button btnSendSMS;
    EditText txtPhoneNo;
    EditText txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btnSendSMS=(Button) findViewById(R.id.btnSendSMS);
        txtPhoneNo = (EditText) findViewById(R.id.txtPhoneNo);
        txtMessage = (EditText) findViewById(R.id.txtMessage);
    }

    protected void sendSMS(View view) {
        String phoneNo = txtPhoneNo.getText().toString();
        String message = txtMessage.getText().toString();
        if (phoneNo.length() > 0 && message.length() > 0) {
            PendingIntent pi = PendingIntent.getActivity(this, 0,
                    new Intent(this, Telephony.Sms.class), 0);
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phoneNo, null, message, pi, null);
        } else {
            Toast.makeText(getBaseContext(),
                    "Please enter both phone number and message.",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
