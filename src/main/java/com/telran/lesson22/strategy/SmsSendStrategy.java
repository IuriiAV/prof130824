package com.telran.lesson22.strategy;

public class SmsSendStrategy implements SendStrategy{

    @Override
    public void send(String message) {
        System.out.println("Send use sms" + message);
    }
}
