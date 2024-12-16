package com.telran.homework.homework8.solitaire;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Deck {

    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        initialize();
    }

    private void initialize() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(cards);
    }
}
