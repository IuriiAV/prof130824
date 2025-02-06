package com.telran.myLesson22.stratagy;

public class SmsSendStrategy implements SendStrategy {

    @Override
    public void send(String message) {
        System.out.println("send via sms: " + message);
    }
}
