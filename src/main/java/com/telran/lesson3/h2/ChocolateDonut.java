package com.telran.lesson3.h2;

public class ChocolateDonut extends DonutWithFilling {

    public ChocolateDonut() {
        super("\"Black rose\"");
        Chocolate chocolate = new Chocolate();
        this.setFilling(chocolate);
    }
}
