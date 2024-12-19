package com.telran.homework2.donut.model;

public abstract class DonutWithFilling extends Donut {

    Filling filling;

    public DonutWithFilling(String title) {
        super(title);
    }

    public Filling getFilling() {
        return filling;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return super.toString() +
                " filling";
    }
}
