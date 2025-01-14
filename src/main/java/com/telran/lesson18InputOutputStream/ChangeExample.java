package com.telran.lesson18InputOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ChangeExample {

    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(System.err);

        String path = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/lesson18InputOutputStream/one.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //System.setOut(fileOutputStream);
        System.out.println("hi");
        System.out.println("Java");
    }
}
