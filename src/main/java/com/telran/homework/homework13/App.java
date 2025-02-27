package com.telran.homework.homework13;


import com.telran.homework.homework13.translator.Dictionary;
import com.telran.homework.homework13.translator.DictionaryController;
import com.telran.homework.homework13.translator.TranslatorFileReader;
import com.telran.homework.homework13.translator.TranslatorFileWriter;

public class App {

    public static void main(String[] args) {
        TranslatorFileWriter writer = new TranslatorFileWriter();
        TranslatorFileReader reader = new TranslatorFileReader();
        Dictionary dictionary = new Dictionary(writer, reader);

        new DictionaryController(dictionary);
    }
}
