package com.telran.PasyansApp;

import lombok.Getter;
import lombok.ToString;

import java.util.Stack;

@ToString
@Getter
public class DealManeger {

    private String name;

    public DealManeger(String name) {
        this.name = name;
    }

    private final Stack<Card> stackMain = new Stack<>();
    private final Stack<Card> stackMainTwo = new Stack<>();

    private final Stack<Card> stackOne = new Stack<>();
    private final Stack<Card> stackTwo = new Stack<>();
    private final Stack<Card> stackThree = new Stack<>();
    private final Stack<Card> stackFour = new Stack<>();
    private final Stack<Card> stackFive = new Stack<>();
    private final Stack<Card> stackSix = new Stack<>();
    private final Stack<Card> stackSeven = new Stack<>();


    private final Stack<Card> stackCLUBS = new Stack<>();
    private final Stack<Card> stackDIAMONDS = new Stack<>();
    private final Stack<Card> stackHEARTS = new Stack<>();
    private final Stack<Card> stackSPADES = new Stack<>();

    public void dealCards(Deck deck) {


        for (int i = 0; i < 28; i++) {

            if (stackOne.size() <= 1) {
                stackOne.push(deck.getCards().pop());
            }
            if (isBlackCard(deck.getCards().peek())) {
                stackTwo.push(deck.getCards().pop());
            }

        }
        for (int i = 0; i < 3; i++) {
            stackThree.push(deck.getCards().pop());
        }
        for (int i = 0; i < 4; i++) {
            stackFour.push(deck.getCards().pop());
        }
        for (int i = 0; i < 5; i++) {
            stackFive.push(deck.getCards().pop());
        }
        for (int i = 0; i < 6; i++) {
            stackSix.push(deck.getCards().pop());
        }
        for (int i = 0; i < 7; i++) {
            stackSeven.push(deck.getCards().pop());
        }
        for (int i = 0; i < 24; i++) {
            stackMain.push(deck.getCards().pop());
        }
//        if (stackOne.isEmpty()){
//            stackOne.push(deck.getCards().pop());
//        }
//        for (int i = 0; i < 28; i++) {
//
//            if (stackOne.size() <= 1){
//
//            }
//            if (isBlackCard(deck.getCards().peek())){
//                stackTwo.push(deck.getCards().pop());
//            }
//
//        }
//        for (int i = 0; i < 3; i++) {
//            stackThree.push(deck.getCards().pop());
//        }
//        for (int i = 0; i < 4; i++) {
//            stackFour.push(deck.getCards().pop());
//        }
//        for (int i = 0; i < 5; i++) {
//            stackFive.push(deck.getCards().pop());
//        }
//        for (int i = 0; i < 6; i++) {
//            stackSix.push(deck.getCards().pop());
//        }
//        for (int i = 0; i <7; i++) {
//            stackSeven.push(deck.getCards().pop());
//        }
//        for (int i = 0; i < 24; i++) {
//            stackMain.push(deck.getCards().pop());
//        }

    }

    public boolean isBlackCard(Card card) {
        return card.getSuit().equals(Suit.SPADES) || card.getSuit().equals(Suit.CLUBS);
    }

    public boolean isRedCard(Card card) {
        return card.getSuit().equals(Suit.HEARTS) || card.getSuit().equals(Suit.DIAMONDS);
    }

    public void printApp() {
        if (stackCLUBS.isEmpty()) {
            System.out.print("   CLUBS     ");
        }
        if (stackDIAMONDS.isEmpty()) {
            System.out.print("DIAMONDS     ");
        }
        if (stackHEARTS.isEmpty()) {
            System.out.print("HEARTS     ");
        }
        if (stackSPADES.isEmpty()) {
            System.out.print("SPADES          ");
        } else {
            System.out.print(stackCLUBS.peek() + "  " + stackDIAMONDS.peek() + "  " + stackHEARTS.peek() + "  " + stackSPADES.peek());
        }

        if (stackMainTwo.isEmpty()) {
            System.out.print(" 0     ");
        }
        System.out.println(stackMain.peek() + "\n");
        System.out.println(stackOne.peek() + "   " + stackTwo.peek() + "   " + stackThree.peek() + "   " + stackFour.peek() + "   " + stackFive.peek() + "   " + stackSix.peek() + "   " + stackSeven.peek());

    }
}
