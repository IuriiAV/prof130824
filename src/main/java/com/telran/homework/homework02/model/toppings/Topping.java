package com.telran.homework.homework02.model.toppings;

public abstract class Topping {

    private String title;

    public Topping(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title + "is used as a topping.";
    }
}
