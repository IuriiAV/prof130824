package com.telran.myLesson10.compare;

public class Passport implements Comparable<Passport> {

    private int number;

    public Passport(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                "}\n";
    }

    @Override
    public int compareTo(Passport o) {
        //<0, 0, >0
        return this.number-o.number;
    }
}
