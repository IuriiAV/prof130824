package com.telran.homework.homework_051124.task_1.task_3;

public class OneNumber extends Alphabet {

    private String[] oneTail = {"A", "B", "C", "D", "E", "F", "G", "H"};

    private int ownNumber = 1;

    @Override
    public void printAlphabet() {
        super.printAlphabet();

        for (String letter : oneTail){
            System.out.print(letter + " ,");
        }
        System.out.println();
    }

        public String[] getOneTail () {
            return oneTail;
        }

        public void setOneTail (String[]oneTail){
            this.oneTail = oneTail;
        }

        public int getOwnNumber () {
            return ownNumber;
        }

        public void setOwnNumber ( int ownNumber){
            this.ownNumber = ownNumber;
        }

    }