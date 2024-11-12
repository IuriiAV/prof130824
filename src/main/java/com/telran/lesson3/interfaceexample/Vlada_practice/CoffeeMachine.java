package com.telran.lesson3.interfaceexample.Vlada_practice;

import com.telran.lesson3.interfaceexample.Vlada_practice.model.*;

import java.security.PublicKey;

public class CoffeeMachine {

    private Coffee[] coffees = new Coffee[5];

    public CoffeeMachine() {
        fillCoffee();

    }

    private void fillCoffee() {

        coffees[0] = new CoffeeLatte("Latte");
        coffees[1] = new CoffeeStandard("Standard");
        coffees[2] = new CoffeeCappuccino("Cappuccino");
        coffees[3] = new CoffeeEspresso("Espresso");
        coffees[4] = new CoffeeAmericano("Americano");
    }
    public Cup makeCoffee(int userData) {
        //Coffee , Water, Milk
        Coffee coffee = coffees[userData - 1];
        //instanceof - проверяет, что в переменной объект класса или
        //его наследника
        if (coffee != null) {
            // add milk
            CoffeeMilk coffeeMilk = (CoffeeMilk) coffee;
            Milk milk = new Milk();
            coffeeMilk.setMilk(milk);
        }
        Water water = new Water();
        Cup cup = new Cup(water, coffee);
        return cup;
    }

    public Coffee[] getAll() {
        return coffees;
    }




    /*public Coffee makeCoffee(int userData) {
        return null;
    }

    public Coffee[] getAll() {
        return null;
    }*/
}
