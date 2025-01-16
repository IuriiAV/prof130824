package com.telran.myLesson19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileNioExample {

    public static void main(String[] args) throws IOException {
        String path = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/myLesson19/test.txt";
        //Path filePath = Paths.get(path);
        List<String> strings;
        try {
            strings = Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(strings);
        try {
            Files.write(Path.of(path), strings, StandardOpenOption.APPEND); // дозаписать в файл
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> list = Files.lines(Path.of(path)).filter(s -> s.startsWith("y")).toList();
        System.out.println(list);
    }
}
