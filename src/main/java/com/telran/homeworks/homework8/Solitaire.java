package com.telran.homeworks.homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solitaire {
    public static void main(String[] args) {
        List<String> deck = createDeck();
        Collections.shuffle(deck);

        Stack<String> stack = new Stack<>();
        int iterations = 0;

        for (String card : deck) {
            stack.push(card);
            iterations++;

            while (stack.size() > 1) {
                iterations++;
                String topCard = stack.pop();
                String nextCard = stack.pop();

                if (getSuit(topCard).equals(getSuit(nextCard))) {

                } else {

                    stack.push(nextCard);
                    stack.push(topCard);
                    break;
                }
            }
        }

        if (stack.size() == 4) {
            System.out.println("Solitaire came together! Remaining cards: " + stack);
            System.out.println("Iterations required: " + iterations);
        } else {
            System.out.println("Solitaire didn't come together! Remaining cards: " + stack);
            System.out.println("Iterations required: " + iterations);
        }
    }

    private static List<String> createDeck() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        return deck;
    }

    private static String getSuit(String card) {

        return card.split(" of ")[1];
    }
}