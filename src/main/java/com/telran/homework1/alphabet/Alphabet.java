package com.telran.homework1.alphabet;

public class Alphabet {

    private String name;

    public void printAlphabet() {
        System.out.print("The alphabet's name is " + this.name + ": ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
