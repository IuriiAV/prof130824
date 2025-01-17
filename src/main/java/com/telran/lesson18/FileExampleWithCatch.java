package com.telran.lesson18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExampleWithCatch {
    public static void main(String[] args) throws FileNotFoundException {
        String pathIn = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\lesson18\\testIN.txt";
        String pathOut = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\lesson18\\testOut.text";

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