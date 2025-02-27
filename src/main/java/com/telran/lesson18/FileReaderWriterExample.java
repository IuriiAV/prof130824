package com.telran.lesson18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        //Reader - ready(), read
        String pathIn = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\lesson18\\testIN.txt";

        try {
            FileReader fileReader = new FileReader(pathIn);
            while (fileReader.ready()) {
                int read = fileReader.read();
                System.out.print((char) read );
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String pathOut = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\lesson18\\testOut.text"; ;

        String example = "Hello Привет!";
        try {
            FileWriter writer = new FileWriter(pathOut);
            writer.write(example);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





