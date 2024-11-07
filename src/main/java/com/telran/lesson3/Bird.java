package com.telran.lesson3;

public class Bird extends EarthAnimal implements Flyable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void drink() {

    }

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}
