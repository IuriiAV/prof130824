package com.telran.lesson3.practice_me;

import com.telran.lesson3.practice_me.model.*;

import java.util.Scanner;

public class CoffeeApp {

    public static void main(String[] args) {
        // CoffeeMachine (makeCoffee, listCoffee, )
        // Water, Coffee, Milk

        System.out.println("Hello! Please choose a coffee: ");
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Coffee[] coffees = coffeeMachine.showAll();
        for (int i = 0; i < coffees.length; i++) {
            System.out.println((i + 1) + "—" + coffees[i].getTitle());
        }
        System.out.println("Make a choice (1, 2, 3, 4, 5): ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        Cup cupCoffee = coffeeMachine.makeCoffee(userChoice);
        System.out.println("Your coffee is ready: ");
        cupCoffee.printReadyCoffee();
    }
}
