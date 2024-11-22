package com.telran.summary2.broker;


import java.util.Random;

public class Messege {

    private String Text;

    private int number;


    public Messege(String text) {
        Text = text;
        this.number = new Random().nextInt(100);
    }

    public String getText() {
        return Text;
    }

    @Override
    public String toString() {
        return "Messege{" +
                "Text='" + Text + '\'' +
                ", number=" + number +
                '}';
    }
}
