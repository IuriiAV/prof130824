package com.telran.homework.homework02.model.filling;

public abstract class Filling {

    private final String title;

    public String getTitle() {
        return title;
    }

    public Filling(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "As filling is " + title + ".\n";
    }
}
