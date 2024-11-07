package com.telran.lesson3;

public class Whale extends WaterAnimal {

    public Whale() {
        //
    }

    public Whale(String name) {
        super(name);
    }

    @Override
    public void drink() {
        System.out.println("Whale drink!");
    }

    @Override
    public void swim() {
        System.out.println("Whale swim");
    }
}
