package com.telran.lesson5.deal.add;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    private Card[] cards = new Card[Rank.values().length * Suit.values().length];

    public void fillCards() {
        Rank[] values = Rank.values();
        int counter = 0; //индекс в массиве
        for (int i = 0; i < values.length; i++) {
            cards[counter++] = new Card(Suit.CLUBS, values[i]);
            cards[counter++] = new Card(Suit.HEARTS, values[i]);
            cards[counter++] = new Card(Suit.DIAMONDS, values[i]);
            cards[counter++] = new Card(Suit.SPADES, values[i]);
        }
        shuffle();

    }
    public void shuffle() {
        List<Card> list = Arrays.asList(this.cards);
        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            cards[i] = list.get(i);
        }
    }

    public Card getCard() {

        Card result = cards [cards.length - 1];
        cards = Arrays.copyOf(cards, cards.length -1);
        return result;
    }
}
