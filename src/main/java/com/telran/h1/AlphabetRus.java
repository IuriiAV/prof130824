package com.telran.h1;

import java.util.Arrays;

public class AlphabetRus extends AlphabetEng {

    public final String[] arrAlphabet = {"ы","в","м","и","у","к","ж","ч","й"};

    public AlphabetRus(String name) {
        super(name);
    }

    @Override
    public final void printAlphabet() {
        System.out.println("The name alphabet is  " + super.getName()+ " " + Arrays.toString(arrAlphabet));
    }


}
