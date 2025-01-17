package com.telran.summary7.translator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class CustomFileWriter {

    public static final String PATH = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\summary7\\translator";

    public void writeDictionary(Language language, Map<String,String> newWordsMap){
        StringBuilder stringBuilder = new StringBuilder();
        newWordsMap.forEach((key,value)->{
            stringBuilder.append("\n" + key + ":" + value);
        });

        try {
            Files.write(Path.of(PATH,language.getFileName()),stringBuilder.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            if (e instanceof FileNotFoundException){
                System.out.println("path is incorrect");
            }else {
                System.out.println(e.getMessage());
            }
        }


    }
}
