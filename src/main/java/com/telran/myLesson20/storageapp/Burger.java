package com.telran.myLesson20.storageapp;

public class Burger extends AbstractProduct {

    private String title;

    public Burger(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "title='" + title + '\'' +
                '}';
    }
}
