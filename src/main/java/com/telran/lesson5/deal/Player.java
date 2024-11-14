package com.telran.lesson5.deal;

public class Player {

    private String name;

    private Card[] cards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    public void takeCard(Card card){
        for (int i = 0; i < cards.length; i++) {
            cards[i] = card;
        }
    }

    public void printCards(){
        System.out.println("Player name " + name);
        for (Card card : cards) {
            System.out.println(" " + card.getSuit() + card.getRank() );
        }
        System.out.println();
    }

}
