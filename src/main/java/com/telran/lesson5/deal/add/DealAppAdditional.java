package com.telran.lesson5.deal.add;

public class DealAppAdditional {

    public static void main(String[] args) {
        //Player - takeCard, printAllCard, shuffleDeck

        //Card (suit, rank)

        //Deck - array of Card, fill card, getCard

        Deck deck = new Deck();
        deck.fillCards();

        Player alex = new Player("Alex");
        Player max = new Player("Max");

        alex.shuffleDeck(deck);

        Player[] players = {alex, max};
        for (Player player : players) {
            for (int i = 0 ; i < 5; i++) {
                Card card = deck.getCard();
                player.takeCard(card);
            }
        }

        for (Player player : players) {
            player.printCards();
        }
    }
}
