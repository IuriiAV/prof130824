package com.telran.lesson18InputOutputStream.readerWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

    public static void main(String[] args) {
        //Reader - ready()
        String pathIn = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/lesson18InputOutputStream/withTryCatch/testIn.txt";

        try {
            FileReader fileReader = new FileReader(pathIn);
            while (fileReader.ready()) {
                int read = fileReader.read();
                System.out.print((char) read);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String pathOut = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/lesson18InputOutputStream/withTryCatch/testIn.txt";

        String example = "Hallo Привет!";

        try {
            FileWriter writer = new FileWriter(pathOut);
            writer.write(example);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
