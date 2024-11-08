package com.telran.h1;

import java.util.Arrays;

public class AlphabetEng extends Alphabet {

    public final String[] arrAlphabet = {"z","x","c","v","b","n","m"};

    private int ownNumber;

    public AlphabetEng(String name) {
        super(name);

    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void printAlphabet(){
        System.out.println("The name alphabet is  "+ super.getName() + " " + Arrays.toString(arrAlphabet));
    }

}

