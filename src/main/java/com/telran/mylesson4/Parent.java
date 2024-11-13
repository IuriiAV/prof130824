package com.telran.mylesson4;

public class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public void sayGreetings(){
        System.out.println("Hi from Parent!");
    }

    public String getName() {
        return name;
    }
}
