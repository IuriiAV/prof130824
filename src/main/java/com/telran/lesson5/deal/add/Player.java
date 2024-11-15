package com.telran.lesson5.deal.add;

import java.util.Arrays;

public class Player {

    private String name;

    private Card[] playerCards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    public void takeCard(Card card){
        for (int i = 0; i < playerCards.length; i++) {
            playerCards[i] = card;
        }
    }

    public void printCards(){
        System.out.println("Player name is " + name + " have a cards " + Arrays.toString(playerCards));
    }

    public void shuffleDeck(Deck deck) {

    }

    public Card[] getPlayerCards() {
        return playerCards;
    }

    public String getName() {
        return name;
    }

}
