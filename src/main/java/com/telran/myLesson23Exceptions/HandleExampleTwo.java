package com.telran.myLesson23Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleExampleTwo {

    public static void main(String[] args) {
        exampleCheckedExceptionTwo(null);
    }

    private static void exampleCheckedException() {
        try {
            FileReader fileReader = new FileReader("//home");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void exampleCheckedExceptionTwo(String filename) {
        try {
            System.out.println("Try to read file with name " + filename + " and length " + filename.length());
            FileReader fileReader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
        } catch (NullPointerException e) {
            System.out.println("File Name Is incorrect");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
        }
    }
}
