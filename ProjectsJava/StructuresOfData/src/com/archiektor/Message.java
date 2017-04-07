package com.archiektor;

/**
 * Created by Archiektor on 04.04.2017.
 */
public class Message {

    private String message;

    Message (String message){
        this.message = message;
    }

    public synchronized void showMessage(){
        System.out.println(message);
    }
}
