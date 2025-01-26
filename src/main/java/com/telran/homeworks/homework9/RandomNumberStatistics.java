package com.telran.homeworks.homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomNumberStatistics {

    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> statistics = new HashMap<>();


        for (int i = 0; i <= 50; i++) {
            statistics.put(i, 0);
        }


        for (int i = 0; i < 10000; i++) {
            int number = random.nextInt(51);
            statistics.put(number, statistics.get(number) + 1);
        }


        System.out.println("Number generation statistics:");
        for (Map.Entry<Integer, Integer> entry : statistics.entrySet()) {
            System.out.println("Number " + entry.getKey() + " was generated " + entry.getValue() + " times.");
        }
    }
}
