package com.telran.lesson19.task;

import java.io.FileWriter;
import java.io.IOException;

public class Task {

    public static void main(String[] args) {
        String string = "Some words are";
        String commonPath = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\lesson19\\task";
        String[] words = string.split(" ");


        for (int i = 0; i < words.length; i++) {
            String path = commonPath + "/" + words[i] + ".txt";
            try (FileWriter fileWriter = new FileWriter(path)) {
                fileWriter.write(words[i]);
                fileWriter.flush();
                System.out.println();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }

    }
}
