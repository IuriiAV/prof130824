package com.telran.h2;

import com.telran.h2.model.Donut;

import java.util.Scanner;

public class DonutApp {

    public static void main(String[] args) {

        System.out.println("Hello! Please choose a Donut :");

        DonutMachine donutMachine = new DonutMachine();
        Donut[] donuts = donutMachine.getAll();
        for (int i = 0; i <donuts.length; i++) {
            System.out.println((i+1) + " " + donuts[i].getName());
        }

        System.out.println("Make a choose 1, 2, 3, 4");
        Scanner scanner = new Scanner(System.in);
        int userData = scanner.nextInt();




    }
}
