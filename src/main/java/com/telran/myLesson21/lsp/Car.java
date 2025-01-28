package com.telran.myLesson21.lsp;

public class Car extends Motorized {

    @Override
    public void startEngine() {
        System.out.println("Car has started");
    }

    @Override
    public void drive() {
        System.out.println("Car drive");
    }
}
