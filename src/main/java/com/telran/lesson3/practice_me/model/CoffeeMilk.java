package com.telran.lesson3.practice_me.model;

public abstract class CoffeeMilk extends Coffee {

    private Milk milk;

    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    public CoffeeMilk(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return "CoffeeMilk{" +
                "milk=" + milk +
                '}';
    }
}
