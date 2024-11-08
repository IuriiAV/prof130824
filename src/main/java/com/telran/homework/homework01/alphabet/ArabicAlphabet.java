package com.telran.homework.homework01.alphabet;

public class ArabicAlphabet extends Alphabet {

    char[] characterSet = {'ا', 'ب', 'ت', 'ث', 'ج', 'ح', 'خ', 'د', 'ذ', 'ر', 'ز', 'س', 'ش', 'ص', 'ض', 'ط', 'ظ', 'ع', 'غ', 'ف', 'ق', 'ك', 'ل', 'م', 'ن', 'ه', 'و', 'ي'};

    private int ownNumber;

    public ArabicAlphabet(String name) {
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
