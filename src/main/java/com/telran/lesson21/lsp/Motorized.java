package com.telran.lesson21.lsp;

public class Motorized extends Vehicle {

    public void startEngine() {
        System.out.println("Vehicle start engine");
    }

    @Override
    public void drive() {
        startEngine();
    }
}
