package com.telran.homeworks.homework6;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {
        if (p1.isUrgent() && !p2.isUrgent()) {
            return -1;
        } else if (!p1.isUrgent() && p2.isUrgent()) {
            return 1;
        }

        return Integer.compare(p1.getArrivalOrder(), p2.getArrivalOrder());
    }
}
