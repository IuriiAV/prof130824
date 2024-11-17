package com.telran.mylesson5.deal;

import java.util.Arrays;

public class DealApp {

    public static void main(String[] args) {
        //Players
        //Deck
        //Card

        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Deck deck = new Deck();
        deck.initialize();
        Card[] cards = deck.getCards();
        System.out.println(Arrays.toString(cards));
    }
}
