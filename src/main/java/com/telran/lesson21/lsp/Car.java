package com.telran.lesson21.lsp;

public class Car extends Motorized {

    @Override
    public void startEngine() {
        System.out.println("Car start engine");
    }

    @Override
    public void drive() {
        startEngine();
        System.out.println("Car drive");
    }
}
