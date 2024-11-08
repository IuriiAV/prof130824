package com.telran.lesson3.practice_me.model;

public class Cup {

    private Water water;

    private Coffee coffee;

    public Cup(Water water, Coffee coffee) {
        this.water = water;
        this.coffee = coffee;
    }

    public void printReadyCoffee() {
        System.out.println("Your coffee "
                + coffee.getTitle()
                + " contains: "
                + water
                + " "
                + coffee);
    }
}
