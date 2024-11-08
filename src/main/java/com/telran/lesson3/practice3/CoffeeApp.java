package com.telran.lesson3.practice3;

import com.telran.lesson3.practice3.model.Coffee;
import com.telran.lesson3.practice3.model.Cup;

import java.util.Scanner;

public class CoffeeApp {

    public static void main(String[] args) {
        //CoffeeMachine (makeCoffee, list coffee, )
        //Water, Coffee, Milk

        System.out.println("Hello :) Please choose a coffee: ");
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Coffee[] coffees = coffeeMachine.getAll();

        for (int i = 0; i < coffees.length; i++) {
            System.out.println("" + (i + 1) + " - " + coffees[i]);
        }

        System.out.println("Make your choose (1, 2, 3, 4, 5): ");

        Scanner sc = new Scanner(System.in);
        int userData = sc.nextInt();

        Cup cupOfCoffee = coffeeMachine.makeCoffee(userData);
        System.out.println("Your coffee is ready: ");
        cupOfCoffee.printReadyCoffee();
    }
}
