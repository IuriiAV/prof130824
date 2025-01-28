package com.telran.myLesson21.dip;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CoffeeService {

    private AbstractCoffeeMachine coffeeMachine;

    public void makeCoffee() {
        coffeeMachine.makeCoffee();
    }
}
