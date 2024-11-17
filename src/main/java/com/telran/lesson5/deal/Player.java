package com.telran.lesson5.deal;


public class Player {

    private String name;

    private Card[] cards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    private int emptySlot = 0;

    public boolean takeCard(Card card) {
        if (cards[4] != null) {
            System.out.println("Player " + this.name + " can't take more cards.");
            return false;
        } else {
            this.cards[emptySlot++] = card;
            return true;
        }
    }

    public void printCards() {
        System.out.println("Player name  :" + name);
        for (Card card : cards) {
            System.out.println("" + card.getSuit() + "-" + card.getRank());
        }
        System.out.println();
    }
}
