package com.telran.homework8;

import java.util.Objects;

public class Card {

   private String suit;
   private int rang;

    public Card(String suit, int rang) {
        this.suit = suit;
        this.rang = rang;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rang == card.rang && Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rang);
    }
}
