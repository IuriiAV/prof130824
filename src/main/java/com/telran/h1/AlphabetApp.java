package com.telran.h1;

public class AlphabetApp {
    public static void main(String[] args) {

        AlphabetEng alphabetEng = new AlphabetEng("English");
        alphabetEng.setName("English");
        alphabetEng.setOwnNumber(1);
        System.out.println(alphabetEng.getOwnNumber());
        alphabetEng.printAlphabet();

        AlphabetDeu alphabetDeu = new AlphabetDeu("Deutsch");
        alphabetDeu.setOwnNumber(2);
        System.out.println(alphabetDeu.getOwnNumber());
        alphabetDeu.printAlphabet();

        AlphabetRus alphabetRus = new AlphabetRus("Russia");
        alphabetRus.setOwnNumber(3);
        System.out.println(alphabetRus.getOwnNumber());
        alphabetRus.printAlphabet();

        Alphabet all = new Alphabet("All");
        all.printAllInfo(alphabetEng,alphabetDeu,alphabetRus);


    }
}
