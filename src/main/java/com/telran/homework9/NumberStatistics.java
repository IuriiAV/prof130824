package com.telran.homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumberStatistics {

    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new HashMap<>();
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            int num = r.nextInt(50);
            int value = numbers.getOrDefault(num, 0);
            numbers.put(num, ++value);
        }
        System.out.println(numbers);
    }
}
