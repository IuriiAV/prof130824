package com.telran.mylesson5.deal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    private Card[] cards;

    public Deck() {
        cards = new Card[Suit.values().length * Rank.values().length];
    }

    public void initialize() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card(suit, rank);
            }
        }
        shuffle();
    }

    private void shuffle() {
        List<Card> list = Arrays.asList(this.cards);
        Collections.shuffle(list);

        for (int i = 0; i < list.size(); i++) {
            cards[i] = list.get(i);
        }
    }

    public Card[] getCards() {
        return cards;
    }
}
