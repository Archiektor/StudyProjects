package com.archiektor;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Archiektor on 01.03.2017.
 */
public class DailyAdviceServer {
    String[] adviceList = {"Ешьте меньшими порциями", "Купите облегщающие джинсы.Нет, они делают вас полнее", "Два слова : не годится !", "Будьте честные хотя бы сегодня", "Скажите своему начальнику кто он *на самом деле*"};

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {
                Socket socket = serverSocket.accept();

                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }
}
