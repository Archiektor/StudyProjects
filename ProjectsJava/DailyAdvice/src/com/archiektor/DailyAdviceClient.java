package com.archiektor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Archiektor on 01.03.2017.
 */
public class DailyAdviceClient {

    public void go(){
        try {
            Socket s = new Socket("127.0.0.1", 4242);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());

            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Сегодня ты должен " + advice);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
