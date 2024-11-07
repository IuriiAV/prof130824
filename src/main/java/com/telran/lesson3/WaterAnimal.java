package com.telran.lesson3;

public abstract class WaterAnimal extends Animal {

    public WaterAnimal() {
        //
    }

    public WaterAnimal(String name) {
        super(name);
    }

    public abstract void swim();
}
