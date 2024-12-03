package com.telran.lesson10.compare;

import lombok.ToString;

@ToString
public class Passport implements Comparable<Passport>{

    private int number;

    public Passport(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Passport o) {
        return this.number - o.number;
    }
}
