package com.telran.summery1701.translator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CustomFileReader {

    private static final String PATH = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/summery1701/translator";

    public Map<String, String> readDictionary(Language language) {
        String path = PATH + File.separator + language.getFileName();
        Map<String, String> dictionary = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            while (reader.ready()) {
                String[] split = reader.readLine().split(":");
                dictionary.put(split[0].trim(), split[1].trim());
            }

        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("File is not found " + path);
            } else {
                System.out.println(e.getMessage());
            }
        }
        return dictionary;
    }
}
