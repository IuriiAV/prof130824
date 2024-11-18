package com.telran.lesson5.deal.add;

import java.util.Arrays;


public class Deck {

    private Card[] cards = new Card[Rank.values().length * Suit.values().length];

    public void fillCards() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                cards[i++] = card;
            }
        }
    }

    public Card getCard() {
        Card card = new Card();
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null) {
                card = cards[i];
                cards[i] = null;
                break;
            }
        }
        return card;
    }

    @Override
    public String toString() {
        return "Deck = " + Arrays.toString(cards);
    }
}
