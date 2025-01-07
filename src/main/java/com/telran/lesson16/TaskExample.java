package com.telran.lesson16;

import java.util.Arrays;
import java.util.List;

public class TaskExample {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("BigBen",
                "BigBob",
                "Big",
                "Ben",
                "Big Bob");

        long big = list.stream().filter(b -> b.startsWith("Big")).count();
        System.out.println(big);

    }
}
