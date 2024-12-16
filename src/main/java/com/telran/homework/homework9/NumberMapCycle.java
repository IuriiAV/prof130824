package com.telran.homework.homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumberMapCycle {

    public static void main(String[] args) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        createCycle(numberMap);
        System.out.println(numberMap);
    }

    private static void createCycle(Map<Integer, Integer> numberMap) {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int num = random.nextInt(50);
            Integer count = numberMap.getOrDefault(num, 0);
            numberMap.put(num, ++count);
        }
    }
}
