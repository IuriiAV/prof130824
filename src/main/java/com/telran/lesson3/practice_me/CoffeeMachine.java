package com.telran.lesson3.practice_me;

import com.telran.lesson3.practice_me.model.*;

public class CoffeeMachine {

    private Coffee[] coffees = new Coffee[5];

    public CoffeeMachine() {
        fillCoffee();
    }

    private void fillCoffee() {
        coffees[0] = new CoffeeLatte("Latte");
        coffees[1] = new CoffeeCappuccino("Cappuccino");
        coffees[2] = new CoffeeEspresso("Espresso");
        coffees[3] = new CoffeeBlack("Black");
        coffees[4] = new CoffeeBlack("Americano");
    }

    public Cup makeCoffee(int userChoice) {
        // Coffee, Milk, Water
        Coffee coffee = coffees[userChoice - 1];
        if (coffee instanceof CoffeeMilk) {
            CoffeeMilk coffeeMilk = (CoffeeMilk) coffee;
            Milk milk = new Milk();
            coffeeMilk.setMilk(milk);
        }
        Water water = new Water();
        return new Cup(water, coffee);
    }

    public Coffee[] showAll() {
        return coffees;
    }
}
