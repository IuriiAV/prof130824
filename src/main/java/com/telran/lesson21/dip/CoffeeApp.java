package com.telran.lesson21.dip;

import java.util.Scanner;

public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("1-Black, 2-Latte");
        int data = new Scanner(System.in).nextInt();
        CoffeeService coffeeService;
        if (data == 1) {
            coffeeService = new CoffeeService(new BlackCoffeeMachine());
        } else {
            coffeeService = new CoffeeService(new LatteCoffeeMachine());
        }

        coffeeService.makeCoffee();
    }
}
