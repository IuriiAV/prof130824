package com.telran.lesson15_StreamAPI;

public class AnonymousExample {

    public static void main(String[] args) {
        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };

        printer.print();
    }
}
