package com.telran.PasyansApp;


import lombok.Getter;
import lombok.ToString;

import java.util.*;

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
