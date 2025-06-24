package com.telran.summary1701.translator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CustomFileReader {

    private String path; // = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/summery1701/translator";

    public CustomFileReader(String pathInput) {
        this.path = pathInput;
    }

    public Map<String, String> readDictionary(Language language) {
        String pathInput = path + File.separator + language.getFileName();
        Map<String, String> dictionary = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(pathInput)))) {
            while (reader.ready()) {
                String[] split = reader.readLine().split(":");
                if (split.length < 2) continue;
                dictionary.put(split[0].trim(), split[1].trim());
            }

        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("File is not found " + pathInput);
            } else {
                System.out.println(e.getMessage());
            }
        }
        return dictionary;
    }
}
