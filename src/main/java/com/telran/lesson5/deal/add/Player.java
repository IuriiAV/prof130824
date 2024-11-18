package com.telran.lesson5.deal.add;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Player {

    private String name;

    private Card[] playerCards = new Card[5];


    public void takeCard(Card card) {
        for (int i = 0; i < playerCards.length; i++) {
            if (playerCards[i] != null) {
                continue;
            } else if (playerCards[i] == null) {
                playerCards[i] = card;
            }
            break;
        }
    }

    public void shuffleDeck(Deck deck) {
        Deck[] decks = new Deck[]{deck};
        List<Deck> list = Arrays.asList(decks);
        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            decks[i] = list.get(i);
        }
    }

    public void printCards() {
        System.out.println("Player name is " + name + " have a cards " + Arrays.toString(playerCards));
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player name is : " + name;
    }
}
