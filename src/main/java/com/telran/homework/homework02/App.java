package com.telran.homework.homework02;

import com.telran.homework.homework02.model.Donut;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DonutMachine donutMachine = new DonutMachine();

        System.out.println("Please choose a donat dough type: \n" + donutMachine.getDoughList());
        int doughType = console.nextInt();

        System.out.println("Now choose a donat filling type: \n" + donutMachine.getFillingList());
        int fillingType = console.nextInt();

        System.out.println("Please choose a donat sprinkle type: \n" + donutMachine.getToppingList());
        int toppingType = console.nextInt();

        System.out.println("Size choice: \n" + donutMachine.getSizeList());
        int size = console.nextInt();

        Donut donut1 = donutMachine.makeDonut(doughType, fillingType, toppingType, size);
        System.out.println(donut1);
    }
}
