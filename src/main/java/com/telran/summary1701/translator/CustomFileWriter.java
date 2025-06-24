package com.telran.summary1701.translator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class CustomFileWriter {

    private String path;//"/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/summery1701/translator";


    public CustomFileWriter(String path) {
        this.path = path;
    }

    public void writeDictionary(Language language, Map<String, String> newWordMap) {
        StringBuilder sb = new StringBuilder();

        newWordMap.forEach((k, v) -> {
            sb.append("\n" + k + ":" + v);
        });

        try {
            Files.write(Path.of(path, language.getFileName()), sb.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.err.println("path is incorrect");
            } else
                System.out.println(e.getMessage());
        }
    }

}
