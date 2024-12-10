package com.telran.PasyansApp;


import lombok.ToString;

import java.util.*;

@ToString
public class Deck {

    private final List<Card> cards = new ArrayList<>();

    public void fillCards() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                cards.add(card) ;
            }
        }
    }
    public void shuffleDeck(Deck deck) {
        Collections.shuffle(cards);
    }


//    public Card getCard() {
//        Card card = new Card();
//        for (int i = 0; i < cards.length; i++) {
//            if (cards[i] != null) {
//                card = cards[i];
//                cards[i] = null;
//                break;
//            }
//        }
//        return card;
//    }


}
