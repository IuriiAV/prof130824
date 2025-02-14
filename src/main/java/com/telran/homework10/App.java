package com.telran.homework10;

//Сделать так, что все что передается в System.out - выводилось
//в консоль в обратном порядке

import java.io.PrintStream;

public class App {

    public static void main(String[] args) {
        PrintStream origin = new PrintStream(System.out);

        System.setOut(new CustomPrintStream(System.out));
        System.out.println("Hello");

        System.setOut(origin);
        System.out.println("Hello");
    }
}
