package com.telran.homework2.donut.model;

public abstract class Donut {

    private String title;

    public Donut(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
