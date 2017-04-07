package com.example.nikki.simpleprogrammbroadcast;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.widget.Toast;

import java.text.Format;
import java.util.Date;

/**
 * Created by Nikki on 28.08.2016.
 */
public class TimeBroadcastReceiver extends BroadcastReceiver {

    public TimeBroadcastReceiver() {

    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public void onReceive(Context context, Intent intent) {
        StringBuilder msgStr = new StringBuilder("Текущее время :");
        Format formatter = new SimpleDateFormat("hh:mm:ss a");
        msgStr.append(formatter.format(new Date()));
        Toast.makeText(context, msgStr, Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "message find ! ", Toast.LENGTH_LONG).show();
    }
}
