package com.telran.homework.homework8.solitaire;

import lombok.Getter;

public class Card {

    @Getter
    private Suit suit;

    @Getter
    private Rank rank;

    private static String icon;

    private static String rankNum;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }


    @Override
    public String toString() {
        switch (suit) {
            case CLUBS -> icon = "♣\uFE0F";
            case HEARTS -> icon = "❤\uFE0F";
            case SPADES -> icon = "♠\uFE0F";
            case DIAMONDS -> icon = "♦\uFE0F";
        }

        switch (rank) {
            case TWO -> rankNum = "2";
            case THREE -> rankNum = "3";
            case FOUR -> rankNum = "4";
            case FIVE -> rankNum = "5";
            case SIX -> rankNum = "6";
            case SEVEN -> rankNum = "7";
            case EIGHT -> rankNum = "8";
            case NINE -> rankNum = "9";
            case TEN -> rankNum = "10";
            case JACK -> rankNum = "J";
            case QUEEN -> rankNum = "Q";
            case KING -> rankNum = "K";
            case ACE -> rankNum = "A";
        }

        return "{" + rankNum  + icon + '}';
    }
}
