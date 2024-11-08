package com.telran.homeworks.hw01_05_11_24.alphabet;

public class Alphabet {

    private String name;

    public Alphabet(String name) {
        this.name = name;
    }

    public void printAlphabet() {
        System.out.print("The name of this alphabet is " + this.name + ": ");
    }

    public static void printAllInfo(Alphabet[] alphabets) {
        for (Alphabet alphabet: alphabets) {
            System.out.println(alphabet);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
