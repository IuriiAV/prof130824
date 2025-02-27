package com.telran.lesson10.comparre;

import lombok.ToString;

@ToString
public class Passport implements Comparable<Passport>{

    private int number;

    private String title;

    public Passport(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Passport o) {

        // < 0, 0 , >0
        return this.number - o.number;
    }
}
