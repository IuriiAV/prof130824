package com.telran.lesson3.h2;

import java.util.Scanner;

public class DonatMachineApp {
    public static void main(String[] args) {
        System.out.println("What kind of donut do you want? Please make your choose: ");

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        DonatMachine donatMachine = new DonatMachine();
        donatMachine.makeDonat(choose).printReadyDonut();
    }



}
