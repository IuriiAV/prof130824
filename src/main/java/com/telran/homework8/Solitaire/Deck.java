package com.telran.homework8.Solitaire;

import java.util.Collections;
import java.util.Stack;

public class Deck {

    private final Stack<Card> deck = new Stack<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.push(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public boolean isEmpty() {
        return deck.empty();
    }

    public Card popCard() {
        return deck.pop();
    }

    public void printDeck() {
        System.out.println(deck);
    }
}
