package com.telran.lesson21.lsp;

public class Motorized extends Vehicle{

    public void startEngine(){
        System.out.println("Start en");
    }

    @Override
    public void drive() {
        System.out.println("Drive with manual");
    }
}
