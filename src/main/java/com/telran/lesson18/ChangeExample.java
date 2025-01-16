package com.telran.lesson18;

public class ChangeExample {


    public static void main(String[] args) throws Exception {
        System.setOut(new CustomPrintStream(System.out));
        System.out.println("Hello Java");
        System.out.println("Hello");
    }
}
