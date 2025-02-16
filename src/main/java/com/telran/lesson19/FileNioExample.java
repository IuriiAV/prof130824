package com.telran.lesson19;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileNioExample {

    public static void main(String[] args) {
        String path = "/Users/iurii/Downloads/pro130824/src/main/java/com/telran/lesson19";
        Path filePath = Paths.get(path, "test.txt");
        List<String> strings = null;
        try {
            strings = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(strings);

        try {
            Files.write(filePath, strings, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> strings1 = Files.lines(filePath).filter(s -> s.startsWith("H")).toList();
            System.out.println(strings1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
