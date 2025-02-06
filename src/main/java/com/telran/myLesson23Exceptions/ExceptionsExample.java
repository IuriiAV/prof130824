package com.telran.myLesson23Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsExample {

    public static void main(String[] args) {
        exampleCheckedException();
        exampleUncheckedException(10, 0);
        exampleUncheckedNPEException(null);
    }

    private static void exampleCheckedException() {
        try {
            FileReader fileReader = new FileReader("//home");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void exampleUncheckedException(int a, int b) {
        if (b == 0) {
            return;
        }
        System.out.println(a / b);

        //int i = Integer.parseInt("55a");
    }

    private static void exampleUncheckedNPEException(String str) {
        //не окружать в try-catch, проверять кодом
        if (str == null){
            System.out.println("String is null");
            return;
        }
        System.out.println(str.length());
    }
}
