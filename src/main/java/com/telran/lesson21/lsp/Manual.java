package com.telran.lesson21.lsp;

public class Manual extends Vehicle{

    private void startMoving(){
        System.out.println("Start moving");
    }

    @Override
    public void drive() {
        startMoving();
    }
}
