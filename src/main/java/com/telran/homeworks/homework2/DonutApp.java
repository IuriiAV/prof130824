package com.telran.homeworks.homework2;

import com.telran.homeworks.homework2.model.Donut;
import com.telran.homeworks.homework2.model.DonutPack;

import java.util.Scanner;

public class DonutApp {

    public static void main(String[] args) {
        System.out.println("Please choose a donut! : ");
        DonutMachine donutMachine = new DonutMachine();
        Donut[] donuts = donutMachine.getDonuts();
        for (int i = 0; i < donuts.length; i++){
            System.out.println("" + (i+1) + " - " + donuts[i].getTitle());
        }
        System.out.println("Make your choose, please (1,2,3,4,5,6) : ");
        Scanner scanner = new Scanner(System.in);
        int userData = scanner.nextInt();

        DonutPack donutPack = donutMachine.makeDonut(userData);
        System.out.println("Your Donut is ready: ");
        donutPack.printReadyDonut();

    }


}