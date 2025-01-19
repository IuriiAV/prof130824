package com.telran.homeworks.homework10;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 *  1) Сделать так, что все что передается в System.out - выводилось
 * в консоль в обратном порядке
 */
public class Task1 {
    public static void main(String[] args) {

        OutputStream reverseOutputStream = new OutputStream() {


            @Override
            public void write(int b) throws IOException {

            }

            @Override
            public void write(byte[] b, int off, int len) {
                String output = new String(b, off, len);
                String reversedOutput = new StringBuilder(output).reverse().toString();
                System.err.print(reversedOutput);
            }
        };


        System.setOut(new PrintStream(reverseOutputStream, true));


        System.out.println("Hello, Java! How are doing?");

    }
}

