package com.telran.lesson18InputOutputStream.withTryCatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExampleWithTryCatch {

    public static void main(String[] args) {
        String pathIn = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/lesson18InputOutputStream/withTryCatch/testIn.txt";
        String pathOut = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/lesson18InputOutputStream/withTryCatch/testOut.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(pathIn);
            FileOutputStream fileOutputStream = new FileOutputStream(pathOut);
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
