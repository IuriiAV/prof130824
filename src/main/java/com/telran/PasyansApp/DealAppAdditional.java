package com.telran.PasyansApp;

import java.util.Scanner;

public class DealAppAdditional {

    public void run() {

        DealManager alex = new DealManager("Alex");
        Deck deck = new Deck();
        deck.fillCards();
        System.out.println("You start playing solitaire. Enter your name ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Player one = new Player(name);
        System.out.println("Your name is " + name);
        System.out.println("Do you want to shuffle the cards  y/n");

        String choice = scanner.nextLine();
        while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")){
            one.shufflePlayerDeck(deck);
        }


        alex.dealCards(deck);
        alex.printApp();

        one.drawFromDeck(alex);
        alex.putCardsInFinish();










//
//        System.out.println(alex.getStackOne());
//        System.out.println(alex.getStackTwo());
//        System.out.println(alex.getStackThree());
//        System.out.println(alex.getStackFour());
//        System.out.println(alex.getStackFive());
//        System.out.println(alex.getStackSix());
//        System.out.println(alex.getStackSeven());
//        System.out.println(alex.getStackMainTwo());

    }
}
