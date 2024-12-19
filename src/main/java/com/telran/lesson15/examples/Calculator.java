package com.telran.lesson15.examples;

@FunctionalInterface
public interface Calculator {

    int sum(int a, int b);

    //int mult(int a, int b);

   default void printHello() {
       System.out.println("Hello");
   }
}
