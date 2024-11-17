package com.telran.mylesson5.deal;

public class Player {

    private String name;

    private Card[] cards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    public void takeCard(Card card) {

    }

    public void printCards() {
        System.out.println("Player name: " + name);
        for (Card card : cards) {
            System.out.println(card.getSuit() + "-" + card.getRank());
        }
        System.out.println();
    }
}
