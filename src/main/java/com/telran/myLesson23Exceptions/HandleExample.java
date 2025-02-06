package com.telran.myLesson23Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * try-catch
 * use method signature
 */
public class HandleExample {

    public static void main(String[] args) throws FileNotFoundException {
        exampleCheckedException();
    }

    private static void exampleCheckedException() throws FileNotFoundException {

            FileReader fileReader = new FileReader("//home");

    }
}
