package com.telran.PasyansApp;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DealAppAdditional {

    public void run() {

        DealManeger alex = new DealManeger("Alex");
        Deck deck = new Deck();
        deck.fillCards();

        Player kostya = new Player("Kostya");

        kostya.shufflePlayerDeck(deck);

        alex.dealCards(deck);

        System.out.println(deck.getCards().size());
        alex.printApp();

        System.out.println(alex.getStackOne());
        System.out.println(alex.getStackTwo());
//        System.out.println(alex.getStackThree());
//        System.out.println(alex.getStackFour());
//        System.out.println(alex.getStackFive());
//        System.out.println(alex.getStackSix());
//        System.out.println(alex.getStackSeven());

    }
}
