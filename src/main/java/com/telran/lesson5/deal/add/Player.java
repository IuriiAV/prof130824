package com.telran.lesson5.deal.add;


public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void takeCard(Card card) {

    }

    public void printCards() {

    }

    public void shuffleDeck(Deck deck) {

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
