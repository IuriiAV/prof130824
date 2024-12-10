package com.telran.PasyansApp;

public class Card {

    private Suit suit;

    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }



    @Override
    public String toString() {
        return "Card: " + suit + " " + rank;
    }
}
