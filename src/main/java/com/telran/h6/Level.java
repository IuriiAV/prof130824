package com.telran.h6;

import java.util.Comparator;

public enum Level implements Comparator<Patient> {


    Highest,

    Intermediate,

    Lowest;


    @Override
    public int compare(Patient o1, Patient o2) {
        return 0;
    }
}
