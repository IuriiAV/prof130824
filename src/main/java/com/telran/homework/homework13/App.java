package com.telran.homework.homework13;

import com.telran.summary.summary19.translator.*;

public class App {

    public static void main(String[] args) {
        TranslatorFileWriter writer = new TranslatorFileWriter();
        TranslatorFileReader reader = new TranslatorFileReader();
        Dictionary dictionary = new Dictionary(writer, reader);

        new DictionaryController(dictionary);
    }
}
