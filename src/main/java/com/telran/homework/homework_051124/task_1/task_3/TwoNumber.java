package com.telran.homework.homework_051124.task_1.task_3;

public class TwoNumber extends Alphabet{

    private String[] secondTail = {"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"};

    private int ownNumber = 2;

    @Override
    public void printAlphabet() {
        super.printAlphabet();

        for (String letter : secondTail){
            System.out.print(letter + " ,");
        }
        System.out.println();
    }

    public String[] getSecondTail() {
        return secondTail;
    }

    public void setSecondTail(String[] secondTail) {
        this.secondTail = secondTail;
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
}
