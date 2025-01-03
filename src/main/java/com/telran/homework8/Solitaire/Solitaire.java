package com.telran.homework8.Solitaire;

import java.util.Stack;

public class Solitaire {

    private final Stack<Card> cards = new Stack<>();
    private final Deck deck;

    public Solitaire(Deck deck) {
        this.deck = deck;
    }

    public void play() {
        while (!deck.isEmpty()) {
            if (cards.empty()) {
                cards.push(deck.popCard());
            } else {
                Card card = cards.peek();
                Card cardFromDeck = deck.popCard();
                if (card.getSuit().equals(cardFromDeck.getSuit())) {
                    cards.pop();
                } else {
                    cards.push(cardFromDeck);
                }
            }
        }
    }

    public boolean isWin() {
        return cards.size() == 4;
    }

    public void printCards() {
        System.out.println(cards);
    }
}
