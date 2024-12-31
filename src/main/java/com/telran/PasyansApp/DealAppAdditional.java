package com.telran.PasyansApp;

import java.util.Scanner;

public class DealAppAdditional {

    public void run() {

        DealManager alex = new DealManager("Alex");
        Deck deck = new Deck();
        deck.fillCards();
        System.out.println("You start playing Pasyans. Enter your name ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Player one = new Player(name);
        System.out.println("Your name is " + name);
        System.out.println("          You start play\n");

        one.shufflePlayerDeck(deck);


        alex.dealCards(deck);
        alex.printApp();

        one.drawFromDeck(alex);
        alex.putCardsInFinishStack();

        alex.printApp();


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
