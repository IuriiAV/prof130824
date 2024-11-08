package com.telran.h1;

import java.util.Arrays;

public class AlphabetDeu extends AlphabetEng {

    public final String[] arrAlphabet = {"s","d","f","ü","ß","ö"};

    public AlphabetDeu(String name) {
        super(name);
    }

    @Override
    public void printAlphabet() {
        System.out.println("The name alphabet is  " + super.getName() + " " + Arrays.toString(arrAlphabet));
    }


}

