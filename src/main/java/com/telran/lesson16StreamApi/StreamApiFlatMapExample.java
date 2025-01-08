package com.telran.lesson16StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApiFlatMapExample {

    public static void main(String[] args) {
        List<Integer> one = Arrays.asList(1, 2, 3, 4);
        List<Integer> two = Arrays.asList(5, 6, 7, 8);

        List<List<Integer>> all = Arrays.asList(one, two);

        all.stream().
                flatMap(list -> list.stream())
                .map(value -> value * 2)
                .forEach(value -> System.out.println(" " + value));
    }
}
