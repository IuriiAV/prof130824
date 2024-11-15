package com.telran.lesson5.deal;

import java.util.Arrays;

public class DealApp {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.initialize();
        System.out.println(deck);

        System.out.println();

        Card[] cards = deck.getCards();
        System.out.println(Arrays.toString(cards));

    }
}
