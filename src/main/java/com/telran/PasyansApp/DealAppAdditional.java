package com.telran.PasyansApp;

import java.util.Scanner;

public class DealAppAdditional {

    public void run() {

        DealManager alex = new DealManager("Alex");
        Deck deck = new Deck();
        deck.fillCards();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = scanner.nextLine();
        Player kostya = new Player("Kostya");

        kostya.shufflePlayerDeck(deck);

        alex.dealCards(deck);
        alex.printApp();

        kostya.drawFromDeck(alex);
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
