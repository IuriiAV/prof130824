package com.telran.summary2401_lesson20.storageapp;

public class Donut  extends AbstractProduct {
    private  String title;

    public Donut(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
}
