package com.telran.PasyansApp;

import lombok.Getter;
import lombok.ToString;

import java.util.Scanner;
import java.util.Stack;

@ToString
@Getter
public class DealManager {

    private String name;

    public DealManager(String name) {
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

        while (!deck.getCards().isEmpty()) {

            dealSevenStack(deck,stackOne,1);
            dealSevenStack(deck,stackTwo,2);
            dealSevenStack(deck,stackThree,3);
            dealSevenStack(deck,stackFour,4);
            dealSevenStack(deck,stackFive,5);
            dealSevenStack(deck,stackSix,6);
            dealSevenStack(deck,stackSeven,7);

            stackMain.push(deck.getCards().pop());
        }
    }

    private void dealSevenStack(Deck deck, Stack<Card> stack , int quantity) {
        if (stack.isEmpty()) {
            stack.push(deck.getCards().pop());
        }
        if (stack.size() < quantity && isBlackCard(stack.peek())) {
            if (isRedCard(deck.getCards().peek())) {
                stack.push(deck.getCards().pop());
            }
        } else if (stack.size() < quantity && isRedCard(stack.peek())) {
            if (isBlackCard(deck.getCards().peek())) {
                stack.push(deck.getCards().pop());
            }
        }
    }

    public boolean isBlackCard(Card card) {
        return card.getSuit().equals(Suit.SPADES) || card.getSuit().equals(Suit.CLUBS);
    }

    public boolean isRedCard(Card card) {
        return card.getSuit().equals(Suit.HEARTS) || card.getSuit().equals(Suit.DIAMONDS);
    }

    public void putCardsInFinishStack(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите карту которую хотите поместить в колоду(Первая карта должна быть 'ACE' ): 1  2  3  4  5  6  7");
        switch (sc.nextLine()){
           case "1" -> choicesStack(stackOne);
           case "2" ->  choicesStack(stackTwo);
           case "3" ->  choicesStack(stackThree);
           case "4" ->  choicesStack(stackFour);
           case "5" ->  choicesStack(stackFive);
           case "6" ->  choicesStack(stackSix);
           case "7" ->  choicesStack(stackSeven);
        }
    }

    private void choicesStack(Stack<Card> stack) {
        if (stack.peek().getSuit().equals(Suit.CLUBS)){
            stackCLUBS.push(stack.pop());
        } else if (stack.peek().getSuit().equals(Suit.DIAMONDS)) {
            stackDIAMONDS.push(stack.pop());
        } else if (stack.peek().getSuit().equals(Suit.HEARTS)) {
            stackHEARTS.push(stack.pop());
        } else if (stackOne.peek().getSuit().equals(Suit.SPADES)) {
            stackSPADES.push(stack.pop());
        }
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
        if (stackMain.isEmpty()) {
            System.out.print("lear          ");
        }
        if (stackSPADES.isEmpty()) {
            System.out.print("SPADES          ");
        } else {
            System.out.print(stackCLUBS.peek() + "  " + stackDIAMONDS.peek() + "  " + stackHEARTS.peek() + "  " + stackSPADES.peek());
        }

        if (stackMainTwo.isEmpty()) {
            System.out.print(" 0     ");
        }else {
            System.out.print(stackMainTwo.peek() + "     ");
        }

        if(!stackMainTwo.isEmpty()){
            System.out.println("0 \n");
        }else {
            System.out.println(stackMain.peek() + "\n");
        }

        System.out.println(stackOne.peek() + "   " + stackTwo.peek() + "   " + stackThree.peek() + "   " + stackFour.peek() + "   " + stackFive.peek() + "   " + stackSix.peek() + "   " + stackSeven.peek());

    }
}
