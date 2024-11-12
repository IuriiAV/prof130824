package com.telran.h2;

import com.telran.h2.model.*;

public  class DonutMachine {

    private Donut[] donuts = new Donut[4];

    public DonutMachine(){
        follDonut();
    }
    private void follDonut(){
        donuts[0] = new DonutChocolate("Donut with chocolate");
        donuts[1] = new DonutSugar("Donut with sugar");
        donuts[2] = new DonutJam("Donut with jam");
        donuts[3] = new DonutStandard("Donut Standard");
    }



    public Donut[] getAll(){
        return donuts;
    }
}
