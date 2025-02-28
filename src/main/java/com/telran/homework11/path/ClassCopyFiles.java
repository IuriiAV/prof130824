package com.telran.homework11.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ClassCopyFiles {
    public static void main(String[] args) {
        Path input = Paths.get("C:\\Users\\Maria\\Desktop\\IT\\JavaPRO\\prof130824\\src\\main\\java\\com\\telran\\homework11\\path\\p2in");
        Path output = Paths.get("C:\\Users\\Maria\\Desktop\\IT\\JavaPRO\\prof130824\\src\\main\\java\\com\\telran\\homework11\\path\\p1out");
        copy(input, output);
    }

    public static void copy(Path input, Path output) {
        List<Path> list;
        try {
            list = Files.list(output).map(f -> f.getFileName()).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            try {
                Files.copy(output.resolve(list.get(i)), input.resolve(list.get(i)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
