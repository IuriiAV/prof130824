package com.telran.summary7.translator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DictionaryController {

    private Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("1 - Translate, 2-Update Dictionary");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(reader.readLine());
            switch (i){
                case 1 -> translate(reader);
                case 2 -> update(reader);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void update(BufferedReader reader) throws IOException {
        System.out.println("input language");
        Language language = Language.valueOf((reader.readLine().toLowerCase()));
        System.out.println("Input original:");
        String original = reader.readLine();
        System.out.println("Input translation");
        String translation = reader.readLine();
        dictionary.update(original,translation,language);
    }

    private void translate(BufferedReader reader) throws IOException {

    }
}
