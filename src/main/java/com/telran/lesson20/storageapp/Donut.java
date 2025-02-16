package com.telran.lesson20.storageapp;

import lombok.ToString;

@ToString
public class Donut extends AbstractProduct {

    private String title;

    public Donut(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void printColor() {
        System.out.println("Example");
    }
}
