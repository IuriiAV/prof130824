package com.telran.lesson5.deal.add;


import java.util.ArrayList;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    private ArrayList<Card> hand = new ArrayList<>();


    public void takeCard(Card card) {
        if (card != null) {
            hand.add(card);
        }

    }

    public void printCards() {
        System.out.println(name + "'s cards: ");
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void shuffleDeck(Deck deck) {
        deck.shuffle();
        System.out.println(name + " перемешал колоду.");
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
