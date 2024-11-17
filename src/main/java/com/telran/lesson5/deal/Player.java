package com.telran.lesson5.deal;


public class Player {

    private String name;

    private Card[] cards = new Card[5];

    private int cardIndex = 0;

    public Player(String name) {
        this.name = name;
    }

    public void takeCard(Card card) {
        if (cardIndex >= cards.length) {
            System.out.println("Enough");
            return;
        }
        cards[cardIndex] = card;
        cardIndex++;
    }

    public void printCards() {
        System.out.println("Player name  :" + name);
        for (Card card : cards) {
            System.out.println("" + card.getSuit() + "-" + card.getRank());
        }
        System.out.println();
    }
}
