package com.telran.myLesson19.task;

import java.io.FileWriter;
import java.io.IOException;

public class Task {

    public static void main(String[] args) {
        String string = "Some beautiful words";

        String[] words = string.split(" ");
        String pathTemplate = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/myLesson19/task";

        for (int i = 0; i < words.length; i++) {
            String path = pathTemplate + "/" + words[i] + ".txt";
            try (FileWriter fileWriter = new FileWriter(path)) {
                fileWriter.write(words[i]);
                fileWriter.flush(); //flash() - сбросить инфо из буфера на диск
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
