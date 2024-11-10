package com.telran.lesson1.h1;

public class AlphabetApp {

    public static void main(String[] args) {

        Hiragana hiragana = new Hiragana("Hiragana");

        hiragana.printAlphabet();

        Kandzi kandzi = new Kandzi("Kandzi");

        kandzi.printAlphabet();

        Katakana katakana = new Katakana("Katakana");

        katakana.printAlphabet();

        Alphabet[] alphabets = {hiragana, katakana, kandzi};

        Alphabet.printAllInfo(alphabets);

        hiragana.printOnlyArray();
        kandzi.printOnlyArray();
        katakana.printOnlyArray();
    }
}
