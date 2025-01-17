package com.telran.summary7.translator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CustomFileReader {

    public static final String PATH = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\summary7\\translator";

    public Map<String, String> readDictionary(Language language) {
        String path = PATH + File.separator + language.getFileName();
        Map<String, String> dictionary = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String[] split = string.split(":");
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
