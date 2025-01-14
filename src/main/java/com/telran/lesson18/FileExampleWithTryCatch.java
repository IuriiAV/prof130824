package com.telran.lesson18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExampleWithTryCatch {

    public static void main(String[] args) {
        String pathIn = "/Users/iurii/Downloads/pro130824/src/main/java/com/telran/lesson18/testIn.txt";
        String pathOut = "/Users/iurii/Downloads/pro130824/src/main/java/com/telran/lesson18/testOut.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(pathIn);
            FileOutputStream fileOutputStream = new FileOutputStream(pathOut);
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
