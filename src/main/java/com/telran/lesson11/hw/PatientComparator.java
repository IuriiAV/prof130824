package com.telran.lesson11.hw;

import java.util.Comparator;

public class PatientComparator implements Comparator <Patient> {


    @Override
    public int compare(Patient o1, Patient o2) {

        if (o1.isUrgent() && !o2.isUrgent()){
            return -1;
        } else if (!o1.isUrgent() && o2.isUrgent())  {
            return 1;
        } else {
            return 0;
        }
    }
}
