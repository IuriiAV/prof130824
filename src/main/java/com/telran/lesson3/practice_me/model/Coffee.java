package com.telran.lesson3.practice_me.model;

public abstract class Coffee {

    private String title;

    public String getTitle() {
        return title;
    }

    public Coffee(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
