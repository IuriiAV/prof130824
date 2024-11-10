package com.telran.lesson3.practicethree;

import com.telran.lesson3.practicethree.model.Coffee;
import com.telran.lesson3.practicethree.model.Cup;

import java.util.Scanner;

public class CoffeeApp {

    public static void main(String[] args) {

        //CoffeeMachine (make Coffee,list coffee)
        //Water, Coffee, Milk


        System.out.println("Hello! Please choose a coffee : ");
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Coffee[] coffees = coffeeMachine.getAll();
        for (int i = 0; i < coffees.length; i++) {
            System.out.println("" + (i+1) +"-" + coffees[i]);
        }
        System.out.println("Make a choose(1,2,3,4,5) : ");
        Scanner scanner = new Scanner(System.in);
        int userData = scanner.nextInt();

        Cup cupCoffee = coffeeMachine.makeCoffee(userData);
        System.out.println("Your coffee ready : ");
        cupCoffee.printReadyCoffee();
    }
}
