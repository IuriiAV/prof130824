package com.telran.lesson5.deal.add;


import java.util.Arrays;

public class Player {

    private String name;

    private Card[] cards = new Card[5];
    private int index = 0;

    public Player(String name) {
        this.name = name;
    }

    public void takeCard(Card card) {
        cards[index++] = card;

    }

    public void printCards() {
        System.out.println(Arrays.deepToString(cards));

    }

    public void shuffleDeck(Deck deck) {
        deck.shuffle();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
