package com.telran.lesson3;

public class Lion extends EarthAnimal {

    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Lion eat eat eat");
    }

    @Override
    public void drink() {
        System.out.println("Lion driiink!");
    }




}
