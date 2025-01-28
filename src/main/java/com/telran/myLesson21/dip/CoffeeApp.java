package com.telran.myLesson21.dip;

import java.util.Scanner;

public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("1 - black, 2 - latte");
        int data = new Scanner(System.in).nextInt();
        CoffeeService coffeeService;
        if(data == 1){
            coffeeService = new CoffeeService(new BlackCoffeeMachine());
        }else {
            coffeeService = new CoffeeService(new LatteCaffee());
        }

        coffeeService.makeCoffee();
    }
}
