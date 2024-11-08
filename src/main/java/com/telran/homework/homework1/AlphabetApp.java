package org.telran.homework.homework1;

public class AlphabetApp {
    public static void main(String[] args) {

        UkraineAlphabet ukraineAlphabet = new UkraineAlphabet();
        EnglishAlphabet englishAlphabet = new EnglishAlphabet();
        GermanAlphabet germanAlphabet = new GermanAlphabet();


        ukraineAlphabet.printAlphabet();
        englishAlphabet.printAlphabet();
        germanAlphabet.printAlphabet();


        Alphabet[] alphabets = {ukraineAlphabet, englishAlphabet, germanAlphabet};
        printAllInfo(alphabets);
    }

    public static void printAllInfo(Alphabet[] alphabets) {
        for (Alphabet alphabet : alphabets) {
            alphabet.printAlphabet();
        }
    }

}

