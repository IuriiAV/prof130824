package com.telran.lesson18.homework;


import java.io.FileNotFoundException;

public class Task {

    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new CustomPrintStream(System.out));
        System.out.println("It should be a big text to ensure that all works as wanted!");
        System.out.println("Hello Java");
    }
}
