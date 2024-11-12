package com.telran.homework.homework02.model.topping;

public abstract class Topping {

    private final String title;

    public String getTitle() {
        return title;
    }

    public Topping(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title + " is used as a sprinkled topping.\n";
    }
}
