package com.telran.homework.homework13.translator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TranslatorFileReader {

    private static final String PATH = "/Users/dogoda/java/pro_01/src/main/java/com/telran/summary/summary19/dictionary";

    public Map<String, String> readDictionary(Language language) {
        String path = PATH + File.separator + language.getFileName();
        Map<String, String> dictionary = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            while (reader.ready()) {
                String[] words = reader.readLine().split(":");
                dictionary.put(words[0].trim(), words[1].trim());
            }
        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.err.println("File is not found!");
            } else {
                System.out.println(e.getMessage());
            }
        }
        return dictionary;
    }

}
