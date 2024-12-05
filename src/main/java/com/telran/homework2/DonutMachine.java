package com.telran.homework2;

import com.telran.homework2.model.*;

public class DonutMachine {

    private Donut[] donuts = new Donut[6];
    private Raisin raisin = new Raisin();
    private Chocolate chocolate = new Chocolate();

    public DonutMachine() {
        packDonut();
    }

    private void packDonut() {
        donuts[0] = new CherryDonut("CherryDonut");
        donuts[1] = new StrawberryDonut("StrawberryDonut");
        donuts[2] = new ApricotDonut("ApricotDonut");
        donuts[3] = new ChocolateDonut("ChocolateDonut");
        donuts[4] = new ChocoRaisinDonut("ChocoRaisinDonut");
        donuts[5] = new EmptyDonut("EmptyDonut");
    }

    public DonutPack makeDonut(int userData) {

        Donut donut = donuts[userData - 1];

        if (donut instanceof ChocoDonuts) {

            ChocoDonuts chocoDonuts = (ChocoDonuts) donut;
            Chocolate chocolate = new Chocolate();
            chocoDonuts.setChocolate(chocolate);
        }

        if (donut instanceof ChocoRaisinDonut) {
            ((ChocoRaisinDonut) donut).setRaisin(raisin);
        }
        Dough dough = new Dough();
        DonutPack donutPack = new DonutPack(dough, donut, chocolate, raisin);
        return donutPack;
    }

    public Donut[] getDonuts() {
        return donuts;
    }
}

