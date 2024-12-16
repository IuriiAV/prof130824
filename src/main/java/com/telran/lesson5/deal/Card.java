package com.telran.lesson5.deal;

import com.telran.lesson5.deal.add.Rank;
import com.telran.lesson5.deal.add.Suit;

public class Card {

    private Suit suit;

    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
