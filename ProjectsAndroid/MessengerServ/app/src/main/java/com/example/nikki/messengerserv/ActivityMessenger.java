package com.example.nikki.messengerserv;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

//implements View.OnClickListener
public class ActivityMessenger extends AppCompatActivity {

    final String LOG_TAG = "myLogs";

    //Messenger for communicating with the service.
    Messenger mService = null;

    boolean mBound;

    TextView textIntValue, textStrValue;

    final Messenger mMessenger = new Messenger(new IncomingHandler());

    /*final Button button = (Button) findViewById(R.id.button);
    final Button button2 = (Button) findViewById(R.id.button2);

    button.setOnClickListener(this);
    button2.setOnClickListener(this);

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                editText.setText("Нажата кнопка Button1");
                break;
            case R.id.button2:
                editText.setText("Нажата кнопка Button2");
                break;
        }
    }*/


    //Handler of incoming messages !!! from service.

    class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            Log.d(LOG_TAG, "Incoming handler in activity");
            switch (msg.what) {
                case MessengerService.MSG_SET_INT:
                    textIntValue.setText("Int.message; Received from service: " + msg.arg1);
                    break;
                case MessengerService.MSG_SET_STRING:
                    String str1 = msg.getData().getString("str1");
                    textStrValue.setText("String.message; Received from service 2: " + str1);
                    break;
                default:
                    super.handleMessage(msg);
            }
        }
    }


    //Class for interacting (vzaimodeistvuuchii) with the main interface of the service.
    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName classname, IBinder service) {
            // This is called when the connection with the service has been
            // established, giving us the object we can use to
            // interact with the service.  We are communicating with the
            // service using a Messenger, so here we get a client-side
            // representation of that from the raw IBinder object.
            mService = new Messenger(service);
            mBound = true;
            Log.d(LOG_TAG, "Service connecting; Attached");
            try {
                Message msg = Message.obtain(null, MessengerService.MSG_REGISTER_CLIENT);
                msg.replyTo = mMessenger;
                mService.send(msg);
            } catch (RemoteException e) {
                // In this case the service has crashed before we could even do anything with it
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            // This is called when the connection with the service has been
            // unexpectedly disconnected -- that is, its process crashed.
            /*try {
                Message msg = Message.obtain(null, MessengerService.MSG_UNREGISTER_CLIENT);
                msg.replyTo = mMessenger;
                mService.send(msg);
            } catch (RemoteException e) {
                // There is nothing special we need to do if the service has crashed.
            }*/
            mService = null;
            mBound = false;
            Log.d(LOG_TAG, "Service discconnect");
        }
    };


    public void sendMessageToService(int intvaluetosend) {
        // Create and send a message to the service, using a supported 'what' value
        if (mBound) {
            try {
                Message msg = Message.obtain(null, MessengerService.MSG_SET_INT, intvaluetosend, 0);
                msg.replyTo = mMessenger;
                mService.send(msg);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textIntValue = (TextView) findViewById(R.id.textIntValue);
        textStrValue = (TextView) findViewById(R.id.textStrValue);

        //restoreMe(savedInstanceState);

        //CheckIfServiceIsRunning();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("textIntValue", textIntValue.getText().toString());
        outState.putString("textStrValue", textStrValue.getText().toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Bind to the service
        bindService(new Intent(this, MessengerService.class), mConnection, Context.BIND_AUTO_CREATE);
        mBound = true;
        Log.d(LOG_TAG, "Binded");
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mBound) {
            unbindService(mConnection);
            mBound = false;
            Log.d(LOG_TAG, "Binded");
        }
    }
}
