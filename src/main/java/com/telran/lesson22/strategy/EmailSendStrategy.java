package com.telran.lesson22.strategy;

public class EmailSendStrategy implements SendStrategy {

    @Override
    public void send(String message) {
        System.out.println("Send " + message + " use email");
    }
}
