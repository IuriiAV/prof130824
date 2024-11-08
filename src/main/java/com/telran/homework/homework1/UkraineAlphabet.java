package org.telran.homework.homework1;

import java.util.Arrays;

public class UkraineAlphabet extends Alphabet {


    private String[] letters;
    private int ownNumber;

    public UkraineAlphabet() {
        letters = new String[] {"А,Б,В,Г,Ґ,Д,Е,Є,Ж,З,И,І,Ї,Й,К,Л,М,Н,О,П,Р,С,Т,У,Ф,Х,Ц,Ч,Ш,Щ,ь,Ю,Я"};
       setName("Ukraine ABC");
    }

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println(" " + new String(Arrays.toString(letters)));
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
}
