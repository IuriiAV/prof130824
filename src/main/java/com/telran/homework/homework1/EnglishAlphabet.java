package com.telran.homework.homework1;

import java.util.Arrays;

public class EnglishAlphabet extends Alphabet{

    private String[] letters;
    private int ownNumber;

    public EnglishAlphabet() {
        letters = new String[] {"A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z"};
        setName("English ABC");
    }

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println(" " + new String(Arrays.toString(letters)));
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
}

