package com.telran.DealApp;

import java.util.Arrays;

import java.util.Random;

public class Player {

    private final String name;

    private final Card[] playerCards = new Card[5];


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
        Random random = new Random();
        Card[] decks = deck.getCards();
        for (int i = decks.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); // Случайный индекс от 0 до i
            Card temp = decks[i];
            decks[i] = decks[j];
            decks[j] = temp;
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
