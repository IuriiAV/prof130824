package com.telran.lesson3.practicethree;

import com.telran.lesson3.practicethree.model.*;

public class CoffeeMachine {



    private Coffee[] coffees = new Coffee[5];

    public CoffeeMachine() {
        fillCoffee();
    }

    private void fillCoffee() {
        coffees[0] = new CoffeeLatte("Latte");
        coffees[1] = new CoffeeStandart("Standart");
        coffees[2] = new CoffeeCapuccino("Capuccino");
        coffees[3] = new CoffeeEspresso("Espresso");
        coffees[4] = new CoffeeAmericano("Americano");
    }

    public Cup makeCoffee(int userData) {
        //Coffee,Water, Milk
        Coffee coffee = coffees[userData - 1];
        //instansof - проверяет что в переменной обект класса или его наследника
        if (coffee instanceof CoffeeMilk){
            //add milk
            CoffeeMilk coffeeMilk = (CoffeeMilk) coffee;
            Milk milk = new Milk();
            coffeeMilk.setMilk(milk);
        }
        Water water = new Water();
        Cup cup = new Cup(water,coffee);
        return cup;
    }

    public Coffee[] getAll(){
        return coffees;
    }

}
