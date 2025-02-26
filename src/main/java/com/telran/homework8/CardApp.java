package com.telran.homework8;

import java.util.Collections;
import java.util.Stack;

public class CardApp {

    public static void main(String[] args) {
        Stack<Card> cards = new Stack<>();
        for (int i = 0; i <= 3; i++) {

            for (int j = 2; j <= 14; j++) {
                if (i == 0) {
                    cards.push(new Card("spades", j));
                } else if (i == 1) {
                    cards.push(new Card("hearts", j));
                } else if (i == 2) {
                    cards.push(new Card("diamonds", j));
                } else if (i == 3) {
                    cards.push(new Card("crosses", j));
                }
            }
        }
        Collections.shuffle(cards);

        Stack<Card> cards1 = new Stack<>();
        while (!cards.empty()) {

            if (cards1.empty() || !cards1.peek().getSuit().equals(cards.peek().getSuit())) {
                cards1.push(cards.pop());
            } else {
                cards1.pop();
                cards.pop();
            }
        }
        System.out.println("The rest of the cards: " + cards1.size());
        if (cards1.size() <= 4){
            System.out.println("Solitaire is ok");
        } else {
            System.out.println("Solitaire is not ok");
        }
    }
}
