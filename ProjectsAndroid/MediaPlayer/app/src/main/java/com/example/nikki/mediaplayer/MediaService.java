package com.example.nikki.mediaplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Nikki on 25.08.2016.
 */
public class MediaService extends Service {

    MediaPlayer smallM;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        smallM = MediaPlayer.create(this, R.raw.insane);
        smallM.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        smallM.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        smallM.stop();
    }
}
