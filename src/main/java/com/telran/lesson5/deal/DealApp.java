package com.telran.lesson5.deal;

import java.util.Arrays;

public class DealApp {

    public static void main(String[] args) {
        //Players,
        //Deck
        //Card

        Deck deck = new Deck();
        deck.initialize();
        Card[] cards = deck.getCards();
        System.out.println(Arrays.toString(cards));

        Player player1 = new Player("John");
        deck.giveCard(player1);
        deck.giveCard(player1);
        deck.giveCard(player1);
        deck.giveCard(player1);
        deck.giveCard(player1);
        deck.giveCard(player1);

        player1.printCards();
    }
}
