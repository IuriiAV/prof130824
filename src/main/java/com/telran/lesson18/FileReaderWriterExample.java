package com.telran.lesson18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

    public static void main(String[] args) {
        //Reader - ready(), read
        String pathIn = "/Users/iurii/Downloads/pro130824/src/main/java/com/telran/lesson18/testIn.txt";

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

        String pathOut = "/Users/iurii/Downloads/pro130824/src/main/java/com/telran/lesson18/testOut.txt";

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
