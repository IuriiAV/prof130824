package com.telran.lesson15.basefi;

import java.util.function.BiConsumer;

/**
 * BiConsumer :
 * method accept
 * Принимает два параметра и ничего не возвращает
 */
public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> sum = (a,b) -> System.out.println("Sum " + (a + b));
        BiConsumer<Integer, Integer> mult = (a,b) -> System.out.println("Mult " + (a * b));

        sum.accept(10,6);
        mult.accept(7,4);

    }
}