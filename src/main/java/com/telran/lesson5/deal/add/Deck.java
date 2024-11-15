package com.telran.lesson5.deal.add;

import java.util.Arrays;


public class Deck {

    private Card[] cards = new Card[Rank.values().length * Suit.values().length];

    public void fillCards(){
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                cards[i++] = card;
            }
        }
    }

    public Card getCard(){
        return cards[0];
    }

    @Override
    public String toString() {
        return "Deck = " + Arrays.toString(cards);
    }
}
