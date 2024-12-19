package com.telran.lesson15_StreamAPI.baseFI;

import java.util.function.BiConsumer;

/**
 * Consumer :
 * method accept
 * Принимает ДВА параметр и ничего не возвращает
 */

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println("Sum is " + (a + b));
        BiConsumer<Integer, Integer> mult = (a, b) -> System.out.println("Mult is " + (a * b));

        sum.accept(10, 6);
        mult.accept(7, 4);
    }
}
