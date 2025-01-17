package com.telran.summary7.translator;

public class DictionaryApp {

    public static void main(String[] args) {
        CustomFileWriter customFileWriter = new CustomFileWriter();
        CustomFileReader customFileReader = new CustomFileReader();
        Dictionary dictionary = new Dictionary(customFileWriter,customFileReader);
        dictionary.update("дверь","door",Language.ENGLISH);

        String door = dictionary.getTranslate("дверь", Language.ENGLISH);
        System.out.println(door);
        new DictionaryController(dictionary).start();
    }
}
