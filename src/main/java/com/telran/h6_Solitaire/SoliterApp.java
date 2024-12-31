package com.telran.h6_Solitaire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class SoliterApp {

    public static void main(String[] args) throws IOException {

        Deck deck = new Deck();
        deck.fillCards();
        Scanner scanner = new Scanner(System.in);
        String run = "y";


        System.out.println("You start playing solitaire. Enter your name ");
        String name = scanner.nextLine();
        Player kostya = new Player(name);
        System.out.println("Your name is " + name);

        while (run.equals("y")) {
            System.out.println("Do you want to shuffle the cards  y/n");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choice = reader.readLine();
            if (choice.equals("y")) {
                kostya.shufflePlayerDeck(deck);
            }
            System.out.println("The DECK -> " + deck.getCards());
            if (kostya.getUserDeck().isEmpty()) {
                System.out.println("Your Deck  ->        0 ");
            } else {
                System.out.println("Your Deck  -> " + kostya.getUserDeck().peek());
            }

            System.out.println("Get a card from the deck");

            kostya.getCardFromDeck(kostya, deck);

            if (deck.getCards().isEmpty()) {
                System.out.println("The Deck  ->        0 ");
            }
            if (!kostya.getUserDeck().isEmpty() || !deck.getCards().isEmpty()) {
                System.out.println("The DECK -> " + deck.getCards());
                System.out.println("Your Deck  -> " + kostya.getUserDeck());
            }

            deck.fillCards();
            kostya.getUserDeck().removeAllElements();

            System.out.println("Du you want on more play? y/n");
            run = scanner.nextLine();
        }
    }

}
