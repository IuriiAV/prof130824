package com.telran.h10.task1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Unit {

    public void decoder(Path pathCodedText, Path pathDeCodedText) {
        try {
            String codedText = Files.readString(pathCodedText);
            String[] codedArray = codedText.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String code : codedArray) {
                int charCode = Integer.parseInt(code);
                sb.append((char) charCode);
            }
            Files.write(pathDeCodedText, sb.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Text successfully decoded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void encoder(String originalTextFile, Path pathCodedText) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(originalTextFile)))) {
            StringBuilder sb = new StringBuilder();
            while (bufferedReader.ready()) {
                int read = bufferedReader.read();
                sb.append(read).append(" ");
            }
            Files.write(pathCodedText, sb.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Text successfully encoded");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
