package com.telran.lesson15;

public class AnonymousExample {

    public static void main(String[] args) {

        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };

        printer.print();

        PrinterAddItional pri = new PrinterAddItional() {

            @Override
            public void printGreetings() {
                System.out.println("hi");
            }

            @Override
            public void printBye() {
                System.out.println("Bye");
            }
        };
    }
}
