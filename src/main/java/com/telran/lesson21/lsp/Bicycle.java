package com.telran.lesson21.lsp;

public class Bicycle extends Manual {

    @Override
    public void drive() {
        super.drive();
        System.out.println("Bicycle drive");
    }
}
