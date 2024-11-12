package com.telran.homework.homework02.model.fillings;

public abstract class Filling {

    private String title;

    public Filling(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "As filling is " + title + ".";
    }
}
