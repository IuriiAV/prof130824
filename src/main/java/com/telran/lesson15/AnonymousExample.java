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

        PrinterAdditional printerAdditional = new PrinterAdditional() {
            @Override
            public void printGreetings() {
                System.out.println("Hi!");
            }

            @Override
            public void printBye() {
                System.out.println("Bye!");
            }
        };

        printerAdditional.printBye();
    }
}
