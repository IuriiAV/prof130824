package com.telran.myLesson22.stratagy;

public class EmailSendStrategy implements SendStrategy{

    @Override
    public void send(String message) {
        System.out.println("send via e-mail: " + message);
    }
}
