package com.telran.lesson19.task;

import java.io.FileWriter;
import java.io.IOException;

public class Task {

    public static void main(String[] args) {

        String string = "Some words are";
        String dir = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\lesson19\\task";
        String[] words = string.split(" ");

        for (String word : words) {
            String pathDir = dir + "/" + word + ".txt";
            try (FileWriter fileWriter = new FileWriter(pathDir)) {
                fileWriter.write(word);
                fileWriter.flush();
                System.out.println();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
