package com.telran.lesson21.dip;

public class CoffeeService {

    private AbstractCoffeeMachine coffeeMachine;

    public CoffeeService(AbstractCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    //private BlackCoffeeMachine blackCoffeeMachine = new BlackCoffeeMachine();
    //private LatteCoffeeMachine latteCoffeeMachine = new LatteCoffeeMachine();

    public void makeCoffee() {
       coffeeMachine.makeCoffee();
    }
}
