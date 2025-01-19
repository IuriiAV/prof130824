package com.telran.h10.task1;

import java.io.*;
import java.nio.file.*;



public class Task1 {

    public static void main(String[] args) {
        String originalTextFile = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h10\\task1\\originalText.txt";
        Path pathCodedText = Paths.get("C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h10\\task1\\codedText.txt");
        Path pathDeCodedText = Paths.get("C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h10\\task1\\decoded.txt");

        encoder(originalTextFile, pathCodedText);

        decoder(pathCodedText, pathDeCodedText);


    }

    private static void decoder(Path pathCodedText, Path pathDeCodedText) {
        try {
            String codedText = Files.readString(pathCodedText);
            String[] codedArray = codedText.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String code: codedArray ){
                int charCode = Integer.parseInt(code);
                sb.append((char) charCode);
            }
            Files.write(pathDeCodedText, sb.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Text successfully decoded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void encoder(String originalTextFile, Path pathCodedText) {
        try ( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(originalTextFile)))) {
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
