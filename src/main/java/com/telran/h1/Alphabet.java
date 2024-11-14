package com.telran.h1;

import java.util.Arrays;

public class Alphabet {

    private String name;

    public Alphabet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAlphabet(){
        System.out.println("The name alphabet is  " + name);
    }

    public void printAllInfo(AlphabetEng arrAlphabet1, AlphabetDeu arrAlphabet2, AlphabetRus arrAlphabet3){
        String[][] arrAll = new String[][]{arrAlphabet1.arrAlphabet, arrAlphabet2.arrAlphabet, arrAlphabet3.arrAlphabet};
        System.out.println("\n   Все алфавиты");
        for (String[] strings : arrAll) {
            System.out.println(Arrays.toString(strings));
        }
    }
}