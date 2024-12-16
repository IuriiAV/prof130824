package com.telran.homework.homework8.solitaire;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class SolitaireApp {

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> cards = deck.getCards();
        System.out.println(cards);

        int attempt = 0;
        while (true) {
            attempt++;
            Stack<Card> result = playGame(cards);
            if (result.size() == 4) {
                System.out.println("Number of attempts to win: " + attempt);
                System.out.println(result);
                break;
            }
            Collections.shuffle(cards);
        }
    }

    private static Stack<Card> playGame(List<Card> cards) {
        Stack<Card> result = new Stack<>();

        for (Card card : cards) {
            if (result.isEmpty()) {
                result.push(card);
            } else {
                if (result.peek().getSuit() == card.getSuit()) {
                    result.pop();
                } else {
                    result.push(card);
                }
            }
        }

        return result;
    }
}
