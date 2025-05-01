package com.telran.lesson5.deal;


public class Player {

    int cardsNumber = 5;

    private String name;

    private Card[] cards = new Card[cardsNumber];

    int emptyIndex = 0;


    public Player(String name) {
        this.name = name;
    }

    public boolean takeCard(Card card) {
        if (emptyIndex > cardsNumber-1) {
            System.out.println("Player can't take more cards");
            return false;
        }
        cards[emptyIndex++] = card;
        return true;
    }

    public void printCards() {
        System.out.println("Player name  :" + name);
        for (Card card : cards) {
            if (card == null) {
                break;
            }
            System.out.println("" + card.getSuit() + "-" + card.getRank());
        }
        System.out.println();
    }
}
