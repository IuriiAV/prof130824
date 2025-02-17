package com.telran.homework11.print;

import java.io.PrintStream;

public class PrintApp {
    public static void main(String[] args) {
        PrintStream origin = new PrintStream(System.out);
        System.setOut(new MyPrint(System.out));
        System.out.println("Hello");
        System.setOut(origin);
        System.out.println("Hello");
    }
}

