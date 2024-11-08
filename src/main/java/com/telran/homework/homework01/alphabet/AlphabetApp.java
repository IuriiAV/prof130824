package com.telran.homework.homework01.alphabet;

public class AlphabetApp {

    public static void main(String[] args) {
        ArabicAlphabet arabicAlphabet = new ArabicAlphabet("Arabic");
        CyrillicAlphabet cyrillicAlphabet = new CyrillicAlphabet("Cyrillic");
        LatinAlphabet latinAlphabet = new LatinAlphabet("Latin");

        arabicAlphabet.printAlphabet();
        cyrillicAlphabet.printAlphabet();
        latinAlphabet.printAlphabet();

        Alphabet[] alphabets = {arabicAlphabet, cyrillicAlphabet, latinAlphabet};

        Alphabet.printAllInfo(alphabets);
    }
}
