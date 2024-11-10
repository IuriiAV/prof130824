package com.telran.lesson1.h1;

import java.util.Arrays;

public class Kandzi extends Alphabet{

    public Kandzi(String name) {
        super(name);
    }

    private int ownNumber;

    private String[] alphabet = {"мей", "мэй", "сю", "таку"};

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
