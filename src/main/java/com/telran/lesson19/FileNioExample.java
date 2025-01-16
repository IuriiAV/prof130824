package com.telran.lesson19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileNioExample {

    public static void main(String[] args) throws IOException {
        String path = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\lesson19";
        Path filePath = Paths.get(path, "test.txt");
        List<String> strings = null;
        try {
            strings = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(strings);

        try {
            Files.write(filePath, strings, StandardOpenOption.APPEND);
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