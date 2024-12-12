package com.telran.PasyansApp;

import lombok.Getter;
import lombok.ToString;


@ToString
@Getter
public class Card {

    private Suit suit;

    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(Suit suit) {
        this.suit = suit;
    }

    public Card() {

    }

    @Override
    public String toString() {
        return "Card: " + suit + " " + rank;
    }
}
