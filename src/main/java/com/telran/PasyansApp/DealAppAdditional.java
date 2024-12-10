package com.telran.PasyansApp;

import java.util.Collections;
import java.util.List;

public class DealAppAdditional {

    public void run() {

        Deck deck = new Deck();
        deck.fillCards();
        System.out.println(deck);

       Player kostya = new Player("Kostya");


       kostya.shufflePlayerDeck(deck);
        System.out.println(deck);
//
//        Player[] players = {kostya,ivan};
//        for (Player player : players) {
//            for (int i = 0; i < 5; i++) {
//                Card card = deck.getCard();
//                player.takeCard(card);
//            }
//        }
//
//        kostya.printCards();
//        ivan.printCards();
//
//        System.out.println(deck);



    }
}
