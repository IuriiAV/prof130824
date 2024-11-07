package com.telran.lesson3;

public class Rabbit extends EarthAnimal {

    public Rabbit() {
    }

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void drink() {
        System.out.println("Rabbit drink");
    }
}
