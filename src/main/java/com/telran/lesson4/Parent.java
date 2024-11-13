package com.telran.lesson4;

public class Parent {

    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public void sayGreetings() {
        System.out.println("Hello from Parent!");
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
