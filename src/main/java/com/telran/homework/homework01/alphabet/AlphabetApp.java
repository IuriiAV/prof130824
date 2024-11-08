package com.telran.homeworks.hw01_05_11_24.alphabet;

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
