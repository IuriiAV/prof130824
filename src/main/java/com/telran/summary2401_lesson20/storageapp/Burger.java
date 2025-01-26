package com.telran.summary2401_lesson20.storageapp;

public class Burger extends AbstractProduct {

    private String title;

    public Burger(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

}
