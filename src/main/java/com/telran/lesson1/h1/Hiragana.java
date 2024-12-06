package com.telran.lesson1.h1;

import java.util.Arrays;

public class Hiragana extends Alphabet{

    public Hiragana(String name) {
        super(name);
    }

    private int ownNumber;

    private String[] alphabet = {"а", "и", "у", "э", "о","я"};

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println(String.join(", ", alphabet));
    }

    public void printOnlyArray() {
        System.out.println(Arrays.toString(alphabet));
    }
}
