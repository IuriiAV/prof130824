package com.telran.homework.homework_2;

import com.telran.homework.homework_2.topping.Topping;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DonutMachine donutMachine = new DonutMachine();
        System.out.println("Which donut would you like? choose: ");
        System.out.println(donutMachine.printFillingsList());
        int filling = scanner.nextInt();
        System.out.println("Which topping would you like? choose: ");
        System.out.println(donutMachine.printToppingList());
        int topping = scanner.nextInt();
        Donut yourDonut = donutMachine.getDonut(filling, topping);
        System.out.println("Here is donut: " + yourDonut);

    }
}
