package com.telran.lesson3.h2;

import java.net.Socket;

public class Plate {

    private Donut donut;

    public Plate(Donut donut) {
        this.donut = donut;
    }

    public void printReadyDonut() {
        if (donut instanceof DonutWithFilling) {

            System.out.println("Your donut is " + donut.getTitle() + ".");
            System.out.println("It contains from: Donut and " + ((DonutWithFilling)donut).getFilling() + ".");
            System.out.println("Good appetite!");
            return;
        }
        System.out.println("Your donut is " + donut.getTitle() + ".");
        System.out.println("Good appetite!");
    }
}
