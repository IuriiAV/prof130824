package com.telran.lesson3;

public class Horse extends EarthAnimal {

    public Horse() {
    }

    public Horse(String name) {
        super(name);
    }

    @Override
    public void drink() {
        System.out.println("Horse drink!!!!");
    }
}
