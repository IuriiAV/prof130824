package com.telran.lesson1.h1;

public class Phone {

    private int number;

    private int model;

    private double weight;

    public Phone(int number, int model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public int getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void getInfo() {
        System.out.println(getNumber() + " " + getModel() + " " + getWeight() + " g.");
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " +  name);
    }

    public int getNumber(int number) {
        return number;
    }
}
