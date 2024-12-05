package com.telran.h6;

import java.util.Comparator;

public class Patient implements Comparator<Patient> {

    private String name;

    private String lastname;

    private int age;

    private Level status;

    public Patient(String name, String lastname, int age, Level status) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.status = status;
    }

    @Override
    public int compare(Patient o1, Patient o2) {


        return 0;
    }
}
