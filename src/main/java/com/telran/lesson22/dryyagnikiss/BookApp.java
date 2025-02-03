package com.telran.lesson22.dryyagnikiss;

public class BookApp {

    public static void main(String[] args) {
        Book book = new Book("Haha", "Duma");
        book.printAuthor();

        printSum(getSum(getOne(),4));

    }

    public static void printSum(int sum) {

    }
    public static int getSum (int one, int two) {
        return 0;
    }

    public static int getOne() {
        return 5;
    }
}
