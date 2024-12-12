package com.telran.h6;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class Patient implements Comparable<Patient> {

    private String name;

    private String lastname;

    private int age;

    private Card card;

    public Patient(String lastname, String name, int age, Card card) {
        this.card = card;
        this.age = age;
        this.lastname = lastname;
        this.name = name;
    }

    @Override
    public int compareTo(Patient o) {
        return Integer.compare(this.getCard().getRang(), o.getCard().getRang());
    }

}
