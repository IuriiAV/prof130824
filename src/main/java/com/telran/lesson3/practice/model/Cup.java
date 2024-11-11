package com.telran.lesson3.practice.model;

public class Cup {

    private Water water;

    private Coffee coffee;

    private Milk milk;

    public Cup(Water water, Coffee coffee, Milk milk) {
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
    }

    public void printReadyCoffee() {
        System.out.println("Your coffee " + coffee.getTitle() + " contains from : "
                + water + " " + coffee);
    }
}
