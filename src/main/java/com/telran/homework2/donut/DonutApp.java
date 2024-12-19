package com.telran.homework2.donut;

import com.telran.homework2.donut.model.Donut;
import com.telran.homework2.donut.model.Plate;

import java.util.Scanner;

public class DonutApp {
    //DonutMachine (makeDonut, list of donuts)
    //donut, filling, sugarPowdered, plate

    public static void main(String[] args) {

        System.out.println("Please, select a type of Donut");
        DonutMachine donutMachine = new DonutMachine();
        Donut[] donuts = donutMachine.getDonuts();

        int i = 1;
        for (Donut donut : donuts) {
            System.out.println(i + " " + donut.getTitle());
            i++;
        }

        System.out.println("choose simply 1, 2, 3 or 4");
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        Plate plate = donutMachine.makeDonut(userInput); //??????
        System.out.println("Take your donut: ");
        plate.printReadyDonut();

    }
}
