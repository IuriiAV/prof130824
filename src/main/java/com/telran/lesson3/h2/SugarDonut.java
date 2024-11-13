package com.telran.lesson3.h2;

public class SugarDonut extends DonutWithFilling {

    public SugarDonut() {
        super("\"Disco\"");
        Sugar sugar = new Sugar();
        this.setFilling(sugar);
    }
}
