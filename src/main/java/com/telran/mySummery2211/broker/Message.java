package com.telran.mySummery2211.broker;

import java.util.Random;

public class Message {

    private String text;

    private int number;

    public Message(String text) {
        this.text = text;
        this.number = new Random().nextInt(100);
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
