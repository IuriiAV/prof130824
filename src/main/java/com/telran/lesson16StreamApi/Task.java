package com.telran.lesson16StreamApi;

import java.util.Arrays;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob", "Big");

        long big = words.stream().filter(s -> s.contains("Big")).count();
        System.out.println(big);
    }
}
