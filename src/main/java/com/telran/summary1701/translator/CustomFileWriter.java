package com.telran.summary1701.translator;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class CustomFileWriter {

    private static final String PATH = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\summary1701\\translator";

    public void writeDictionary(Language language, Map<String, String> newWordMap) {

        StringBuilder sb = new StringBuilder();

        newWordMap.forEach((k, v) -> {
            sb.append("\n" + k + ":" + v);
        });

        try {
            Files.write(Path.of(PATH, language.getFileName()), sb.toString().getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            if (e instanceof FileAlreadyExistsException) {
                System.err.println("path is incorrect");
            } else
                System.out.println(e.getMessage());
        }
    }
}