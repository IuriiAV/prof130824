package com.telran.lesson3.mypractice;

import com.telran.lesson3.mypractice.model.*;

public class CoffeeMachine {

    private Coffee[] coffees = new Coffee[5];

    public CoffeeMachine() {
        follCoffee();
    }

    private void follCoffee(){
        coffees[0] = new CoffeeLatte("Latte");
        coffees[1] = new CoffeeStandard("Standard");
        coffees[2] = new CoffeeCappuccino("Cappuccino");
        coffees[3] = new CoffeeEspresso("Espresso");
        coffees[4] = new CoffeeAmericano("Americano");
    }

    public Cup makeCoffee(int userData){
        Coffee coffee = coffees[userData - 1];
        if(coffee instanceof CoffeeMilk){
            CoffeeMilk coffeeMilk = (CoffeeMilk) coffee;
            Milk milk = new Milk();
            coffeeMilk.setMilk(milk);
        }
        Water water = new Water();
        Cup cup = new Cup(water, coffee);
        return cup;
    }

    public Coffee[] getAll(){
        return coffees;
    }

}
