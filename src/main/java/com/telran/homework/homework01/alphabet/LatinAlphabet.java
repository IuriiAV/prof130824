package com.telran.homework.homework01.alphabet;

public class LatinAlphabet extends Alphabet {

    char[] characterSet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private int ownNumber;

    public LatinAlphabet(String name) {
        super(name);
    }

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        for (int i = 0; i < characterSet.length; i++) {
            if (i == characterSet.length - 1) System.out.println(characterSet[i] + ".");
            else System.out.print(characterSet[i] + ", ");
        }
    }

    @Override
    public String toString() {
        StringBuilder allChars = new StringBuilder();
        for (int i = 0; i < characterSet.length; i++) {
            if (i == characterSet.length - 1) allChars.append(characterSet[i]).append(".");
            else allChars.append(characterSet[i]).append(", ");
        }
        return allChars.toString();
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
}
