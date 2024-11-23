package com.telran.lesson5.deal.add;

public class Card {

    private Suit suit;

    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card() {}


    @Override
    public String toString() {
        return "Card: " + suit + " " + rank;
    }
}
