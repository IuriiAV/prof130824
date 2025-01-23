package com.telran.homework.homework13.translator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class TranslatorFileWriter {

    private static final String PATH = "/Users/dogoda/java/prof130824/src/main/java/com/telran/homework/homework13/dictionary";

    public void writeDictionary(Language language, Map<String, String> wordMap) {
        StringBuilder stringBuilder = new StringBuilder();
        wordMap.forEach((key, value) -> {
            String wordPair = "\n" + key + ":" + value;
            stringBuilder.append(wordPair);
        });
        try {
            Files.write(Path.of(PATH, language.getFileName()), stringBuilder.toString().getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            if (e instanceof NoSuchFileException) {
                System.err.println("There's no such a file");
            } else {
                System.err.println(e.getMessage());
            }
        }
    }
}
