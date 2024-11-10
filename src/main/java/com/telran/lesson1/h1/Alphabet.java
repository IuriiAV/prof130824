package com.telran.lesson1.h1;

import java.util.Arrays;

public abstract class Alphabet {

    private String name;

    public void printAlphabet() {
        System.out.println("The name of alphabet is " + name);
    }

    public static void printAllInfo(Alphabet[] alphabets) {
       for (Alphabet alphabet : alphabets) {
           alphabet.printAlphabet();
       }
    }

    public Alphabet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    }





