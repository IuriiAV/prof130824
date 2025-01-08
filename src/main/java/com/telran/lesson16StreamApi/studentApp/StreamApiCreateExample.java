package com.telran.lesson16StreamApi.studentApp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiCreateExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 3);
        Stream<Integer> stream = list.stream();
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        int[] ints = {1, 2, 3, 4};
        Stream<Integer> boxed = Arrays.stream(ints).boxed();

        list.stream().filter(e -> e < 2)
                .findFirst();
    }
}
