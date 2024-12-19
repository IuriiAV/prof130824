package com.telran.lesson15_StreamAPI.baseFI;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Consumer :
 * method accept
 * Принимает ОДИН параметр и ничего не возвращает
 */
public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> printer = (text) -> System.out.println(text);

        printer.accept("hi");

        Consumer<String> splitter = (text) -> {
            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i));
            }
        };

        splitter.accept("hello");

        IntConsumer intConsumer = a -> System.out.println(a);
        Consumer<Integer> consumer = a -> System.out.println(a);
    }
}
