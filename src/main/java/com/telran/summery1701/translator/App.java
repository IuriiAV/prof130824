package com.telran.summery1701.translator;

public class App {

    public static void main(String[] args) {
        CustomFileWriter writer = new CustomFileWriter();
        CustomFileReader reader = new CustomFileReader();
        Dictionary dictionary = new Dictionary(writer, reader);
        dictionary.updateTranslation("цвет", "color", Language.ENGLISH);
        System.out.println(dictionary.getTranslated(Language.ENGLISH, "привет"));
    }
}
