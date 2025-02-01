package com.telran.lesson21.lsp;

public class Manual extends Vehicle {

    private void startMoving(){
        System.out.println("Manual is moving");
    }

    @Override
    public void drive() {
        startMoving();
        ///super.drive();
    }
}
