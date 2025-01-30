package com.telran.lesson21.lsp;

public class Car extends Motorized{

    @Override
    public void drive() {
        System.out.println("Car Drive");;
    }

    @Override
    public void startEngine() {
        System.out.println("Car start engine");;
    }
}
