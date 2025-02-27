package com.telran.homework2.donut;

import com.telran.homework2.donut.model.*;

public class DonutMachine {

    private Donut[] donuts = new Donut[4];

    public DonutMachine() {
        fillDonutsList();
    }

    private Donut[] fillDonutsList() {
        donuts[0] = new DonutRegular("Regular donut");
        donuts[1] = new DonutWithStrawberry("Donut with strawberry confiture");
        donuts[2] = new DonutWithNutella("Donut with Nutella");
        donuts[3] = new DonutWithCaramel("Donut with caramel");
        return donuts;
    }

    public Plate makeDonut(int userInput) {
        Donut donut = donuts[userInput - 1];
        if (donut instanceof DonutWithFilling) {
            DonutWithFilling donutWithFilling = (DonutWithFilling) donut;

            Filling filling = new Filling();
            donutWithFilling.setFilling(filling);
        }
        Plate plate = new Plate(donut);
        return plate;
    }

    public Donut[] getDonuts() {
        return donuts;
    }
}
