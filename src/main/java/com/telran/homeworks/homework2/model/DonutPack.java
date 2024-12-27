package com.telran.homeworks.homework2.model;

public class DonutPack {

    private Dough dough;
    private Donut donut;
    private Chocolate chocolate;
    private Raisin raisin;

    public DonutPack(Dough dough, Donut donut, Chocolate chocolate, Raisin raisin) {
        this.dough = dough;
        this.donut = donut;
        this.chocolate = chocolate;
        this.raisin = raisin;
    }

    public void printReadyDonut() {
        System.out.print("Your " + donut.getTitle() + " contains: " + dough);

        if (donut instanceof ChocoDonuts) {
            System.out.print(", " + chocolate);
        }
        if (donut instanceof ChocoRaisinDonut) {
            System.out.print(", " + raisin);
        }
        System.out.println();
    }
}