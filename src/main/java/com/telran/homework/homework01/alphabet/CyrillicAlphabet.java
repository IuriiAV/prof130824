package com.telran.homework.homework01.alphabet;

public class CyrillicAlphabet extends Alphabet {

    char[] characterSet = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

    private int ownNumber;

    public CyrillicAlphabet(String name) {
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
