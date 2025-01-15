package com.telran.h9;

/**
 * 1) Сделать так, что все что передается в System.out - выводилось
 * в консоль в обратном порядке
 */

public class Task1 {

    public static void main(String[] args) {

        System.setOut(new CustomPrintStream(System.out));


    }
}
