package com.telran.lesson3.practice3.model;

public abstract class CoffeeMilk extends Coffee{

    private Milk milk;

    public CoffeeMilk(String title) {
        super(title);
    }

    public Milk getMilk() {
        return milk;
    }

    @Override
    public String toString() {
        String title = super.toString();
        return title + " " + milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }
}
