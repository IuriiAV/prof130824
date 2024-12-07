package com.telran.h6;

import java.util.Comparator;

public class sortByLevel implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        if (o1.getLevel().getRang() > o2.getLevel().getRang()) {
            return -1;
        }
        if (o1.getLevel().getRang() < o2.getLevel().getRang()) {
            return 1;
        }
        return 0;
    }

}
