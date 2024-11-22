package com.telran.homework1.alphabet;

import java.util.Arrays;

public class BelarusianAlphabet extends Alphabet {
    private int ownNumber;

    private char[] letters = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'і', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
            'р', 'с', 'т', 'у', 'ў', 'ф', 'х', 'ц', 'ч', 'ш', 'ы', 'ь', 'э', 'ю', 'я'};

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println(Arrays.toString(letters));
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
}
