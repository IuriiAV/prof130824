package com.telran.summary1701.translator;

public class DictionaryApp {

    public static void main(String[] args) {
        String pathOutput = "";
        String pathInput = "";
        CustomFileWriter customFileWriter = new CustomFileWriter(pathOutput);
        CustomFileReader customFileReader = new CustomFileReader(pathInput);
        Dictionary dictionary = new Dictionary(customFileWriter, customFileReader);

        new DictionaryController(dictionary).start();
    }
}
