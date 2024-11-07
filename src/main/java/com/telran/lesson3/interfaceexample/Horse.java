package com.telran.lesson3.interfaceexample;

public class Horse extends Animal implements CanEat, CanJump {

    @Override
    public void eat() {

    }

    @Override
    public void jump() {

    }

    public void run() {
        System.out.println("Horse is running");
    }
}
