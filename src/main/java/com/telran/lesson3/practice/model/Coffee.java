package com.telran.lesson3.practice.model;

/*

             Coffee
   CoffeeMilk       CoffeeBlack
Latte, Cappuccino        Black, Espresso

 */


public abstract class Coffee {

    private String title;

    private String description;

    public Coffee(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return title;
    }
}
