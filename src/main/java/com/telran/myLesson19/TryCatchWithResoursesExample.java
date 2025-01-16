package com.telran.myLesson19;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchWithResoursesExample {

    public static void main(String[] args) {
        String path = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/myLesson19/test.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            int read = fileInputStream.read();
        } catch (IOException e) {
            System.out.println("Read exception " + e.getMessage());
        }

        try (FunnyStream funnyStream = new FunnyStream()) {

        } catch (Exception e) {

        }
    }
}
