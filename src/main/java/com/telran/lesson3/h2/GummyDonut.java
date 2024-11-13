package com.telran.lesson3.h2;

public class GummyDonut extends DonutWithFilling {

    public GummyDonut() {
        super("\"Unikorn\"");
        Gummy gummy = new Gummy();
        this.setFilling(gummy);

    }
}
