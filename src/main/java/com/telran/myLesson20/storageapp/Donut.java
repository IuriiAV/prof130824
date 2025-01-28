package com.telran.myLesson20.storageapp;

public class Donut extends AbstractProduct{

    private String title;

    public Donut(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "title='" + title + '\'' +
                '}';
    }
}
