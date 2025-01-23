package com.telran.homework.homework13.translator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class TranslatorFileWriter {

    private static final String PATH = "/Users/dogoda/java/pro_01/src/main/java/com/telran/summary/summary19/dictionary";

    public void writeDictionary(Language language, Map<String, String> wordMap) {
        StringBuilder stringBuilder = new StringBuilder();
        wordMap.forEach((key, value) -> {
            String wordPair = "\n" + key + ":" + value;
            stringBuilder.append(wordPair);
        });
        try {
            Files.write(Path.of(PATH, language.getFileName()), stringBuilder.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("There's no such a file");
            } else {
                System.out.println(e.getMessage());
            }
        }
    }
}
