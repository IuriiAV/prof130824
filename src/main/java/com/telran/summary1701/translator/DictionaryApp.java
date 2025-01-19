package com.telran.summary1701.translator;

public class DictionaryApp {

    public static void main(String[] args) {
        CustomFileWriter customFileWriter = new CustomFileWriter();
        CustomFileReader customFileReader = new CustomFileReader();
        Dictionary dictionary = new Dictionary(customFileWriter, customFileReader);


        new DictionaryController(dictionary).start();

//        dictionary.update("дверь", "door", Language.ENGLISH);
//
//        System.out.println(dictionary.getTranslate(Language.ENGLISH, "цветок"));
    }
}
