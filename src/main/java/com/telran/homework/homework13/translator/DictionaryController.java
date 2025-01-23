package com.telran.homework.homework13.translator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DictionaryController {

    private Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("1 -> Translate\n2 -> Add word in the dictionary");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(reader.readLine());
            switch (i) {
                case 1 -> translate(reader);
                case 2 -> update(reader);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void update(BufferedReader reader) throws IOException {
        System.out.println("Input language ");
        Language language = Language.valueOf(reader.readLine().toUpperCase());
        System.out.println("Input original ");
        String original = reader.readLine();
        System.out.println("Input translate ");
        String translate = reader.readLine();
        dictionary.update(original, translate, language);
    }

    private void translate(BufferedReader reader) throws IOException {

    }
}
