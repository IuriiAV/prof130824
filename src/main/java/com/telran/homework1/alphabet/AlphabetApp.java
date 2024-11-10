package com.telran.homework1.alphabet;

public class AlphabetApp {

    public static void main(String[] args) {

        BelarusianAlphabet belarusianAlphabet = new BelarusianAlphabet();
        GermanAlphabet germanAlphabet = new GermanAlphabet();
        EnglishAlphabet englishAlphabet = new EnglishAlphabet();

        belarusianAlphabet.setName("Belarusian");
        belarusianAlphabet.printAlphabet();

        germanAlphabet.setName("German");
        germanAlphabet.printAlphabet();

        englishAlphabet.setName("English");
        englishAlphabet.printAlphabet();

        Alphabet[] alphabets = {belarusianAlphabet, germanAlphabet, englishAlphabet};
        printAllInfo(alphabets);
    }

    public static void printAllInfo(Alphabet[] alphabets) {
        for (Alphabet alphabet : alphabets) {
            alphabet.printAlphabet();
        }
    }
}
