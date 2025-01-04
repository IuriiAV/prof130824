package com.telran.homework8.Solitaire;

public class App {

    public static void main(String[] args) {
        int count = 0;
        while (true) {
            count++;
            Deck deck = new Deck();
            System.out.println("After shuffle");
            deck.shuffle();
            deck.printDeck();

            Solitaire solitaire = new Solitaire(deck);
            solitaire.play();
            System.out.println("Did I win? " + solitaire.isWin());
            solitaire.printCards();
            if (solitaire.isWin()) {
                System.out.println("The successful attempt is " + count);
                break;
            }
        }
    }
}
