package com.telran.lesson5.deal.add;

public class DealAppAdditional {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.fillCards();
        System.out.println(deck);

        Player kostya = new Player("Kostya");
        Player ivan = new Player("Ivan");

       kostya.takeCard(deck.getCard());
       kostya.printCards();

        kostya.shuffleDeck(deck);

//        Player[] players = {kostya,ivan};
//        for (Player player : players) {
//            for (int i = 0; i < 5; i++) {
//                Card card = deck.getCard();
//                player.takeCard(card);
//            }
//        }


    }
}
