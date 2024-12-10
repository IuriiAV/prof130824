package com.telran.PasyansApp;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@ToString
@Getter
public class Player {

    private  String name;

    public void shuffleDeck(Deck deck) {
        Collections.shuffle(deck);
    }


//
//    public void takeCard(Card card) {
//        for (int i = 0; i < playerCards.length; i++) {
//            if (playerCards[i] != null) {
//                continue;
//            } else if (playerCards[i] == null) {
//                playerCards[i] = card;
//            }
//            break;
//        }
//    }
//
//    public void shuffleDeck(List<Card> deck) {
//        Collections.shuffle(deck);
//        Random random = new Random();
//        Card[] decks = deck.getCards();
//        for (int i = decks.length - 1; i > 0; i--) {
//            int j = random.nextInt(i + 1); // Случайный индекс от 0 до i
//            Card temp = decks[i];
//            decks[i] = decks[j];
//            decks[j] = temp;
//        }
  //  }
//
//    public void printCards() {
//        System.out.println("Player name is " + name + " have a cards " + Arrays.toString(playerCards));
//    }
//
//    public Player(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Player name is : " + name;
//    }
}
