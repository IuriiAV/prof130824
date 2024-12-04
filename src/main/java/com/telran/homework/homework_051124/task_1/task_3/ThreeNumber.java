package com.telran.homework.homework_051124.task_1.task_3;

public class ThreeNumber extends Alphabet{

    private String[] thirdTail = {"S", "T", "U", "V", "W", "X", "Y", "Z"};

    private int ownNumber = 3;

    @Override
    public void printAlphabet() {
        super.printAlphabet();

        for (int i = 0; i < thirdTail.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(thirdTail[i]);
        }
        System.out.println();
    }

    public String[] getThirdTail() {
        return thirdTail;
    }

    public void setThirdTail(String[] thirdTail) {
        this.thirdTail = thirdTail;
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
}
