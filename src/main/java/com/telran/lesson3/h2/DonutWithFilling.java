package com.telran.lesson3.h2;

public abstract class DonutWithFilling extends Donut {

    private Filling filling;


    public DonutWithFilling(String title) {
        super(title);
    }

    public Filling getFilling() {
        return filling;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }
}