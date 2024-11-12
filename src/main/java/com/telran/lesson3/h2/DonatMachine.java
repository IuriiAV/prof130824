package com.telran.lesson3.h2;

public class DonatMachine {

    private Donut[] donuts = new Donut[5];

    public DonatMachine() {
        init();
    }

    private void init() {
        donuts[0] = new ChocolateDonut();
        donuts[1] = new GummyDonut();
        donuts[2] = new SugarDonut();
        donuts[3] = new SweetDonut();
        donuts[4] = new SaltyDonut();
    }

    public Plate makeDonat(int userData) {
        Donut donut = donuts[userData - 1];

        Plate plate = new Plate(donut);
        return plate;
    }

}



