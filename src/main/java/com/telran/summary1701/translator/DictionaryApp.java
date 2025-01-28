package com.telran.summary1701.translator;

public class DictionaryApp {

    public static void main(String[] args) {
        CustomFileWriter customFileWriter = new CustomFileWriter();
        CustomFileReader customFileReader = new CustomFileReader();
        Dictionary dictionary = new Dictionary(customFileWriter, customFileReader);

        new DictionaryController(dictionary).start();
    }
}
