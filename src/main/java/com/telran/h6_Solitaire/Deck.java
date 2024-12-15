package com.telran.h6_Solitaire;


import lombok.Getter;
import lombok.ToString;

import java.util.Stack;

@ToString
@Getter
public class Deck {

    private final Stack<Card> cards = new Stack<>();


    public void fillCards() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                cards.push(card);
            }
        }
    }
}
