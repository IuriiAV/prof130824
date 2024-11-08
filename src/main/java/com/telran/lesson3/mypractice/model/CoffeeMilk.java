package com.telran.lesson3.mypractice.model;

public abstract class CoffeeMilk extends Coffee{

    private Milk milk;

    public CoffeeMilk(String title) {
        super(title);
    }

    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return  milk + super.getTitle();
    }
}
