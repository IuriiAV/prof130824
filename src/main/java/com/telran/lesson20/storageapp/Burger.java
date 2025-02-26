package com.telran.lesson20.storageapp;

import lombok.ToString;

@ToString
public class Burger extends AbstractProduct{

    private String title;

    public Burger(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
