package com.telran.homework2.donut.model;

public class Plate {

    Donut donut;

    public Plate(Donut donut) {
        this.donut = donut;
    }

    public void printReadyDonut() {
        System.out.println("Your donut is " + donut.getTitle());
    }
}
