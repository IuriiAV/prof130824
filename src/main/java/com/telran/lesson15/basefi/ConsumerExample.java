package com.telran.lesson15.basefi;

import java.util.function.Consumer;

public interface ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> printer = (text) -> System.out.println(text);


    }
}
