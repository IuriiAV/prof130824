package com.telran.h6_Solitaire;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Collections;
import java.util.Stack;


@AllArgsConstructor
@ToString
@Getter
public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    private Stack<Card> userDeck = new Stack<>();

    public void shufflePlayerDeck(Deck deck) {
        Collections.shuffle(deck.getCards());
    }

    public void getCardFromDeck(Player user, Deck deck) {
        userDeck.push(deck.getCards().pop());
        for (int i = 0; i < 51; i++) {
            if (!userDeck.isEmpty() && user.getUserDeck().peek().getSuit().equals(deck.getCards().peek().getSuit())) {
                user.getUserDeck().pop();
                deck.getCards().pop();
            } else {
                userDeck.push(deck.getCards().pop());
            }
        }
    }

}
