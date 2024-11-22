package com.telran.homework1.alphabet;

import java.util.Arrays;

public class EnglishAlphabet extends Alphabet{
    private int ownNumber;

    private char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println(Arrays.toString(letters));
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
}
