package com.telran.lesson19;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourseExample {

    public static void main(String[] args) {
        String path = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\lesson19\\test.txt";
        try (FileInputStream fileInputStream = new CustomFileInputStream(path)) {
            int read  = fileInputStream.read();

        } catch (IOException exception) {
            System.out.println("Read exception" + exception.getMessage());

        }
        try (FunnyStream funnyStream = new FunnyStream()){


        } catch (Exception e) {

        }
    }
}
