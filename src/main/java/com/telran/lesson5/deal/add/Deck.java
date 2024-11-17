package com.telran.lesson5.deal.add;

import java.util.ArrayList;

public class Deck {

    private Card[] cards = new Card[Rank.values().length * Suit.values().length];
    private int nextCardIndex;

    public void fillCards() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card(suit, rank);
            }
        }
        nextCardIndex = cards.length - 1;
    }

    public Card getCard() {
        if (nextCardIndex >= 0) {
            return cards[nextCardIndex--];
        }
        return null;
    }

    public void shuffle() {
        for (int i = cards.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }
}






