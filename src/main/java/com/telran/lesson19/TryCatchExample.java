package com.telran.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchExample {

    public static void main(String[] args) throws IOException {

        String path = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\lesson19\\test.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            throw new FileNotFoundException();
        } catch (IOException e) {
            System.out.println("File with path " + path + " not found " + e.getMessage());
            //throw new RuntimeException();
            //System.exit(0);
        } finally {
            System.out.println("End of program");
            fileInputStream.close();
        }


    }
}
