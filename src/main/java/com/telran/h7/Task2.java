package com.telran.h7;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < 10000; i++) {
            Random random = new Random();
            int key = random.nextInt(50);
            int value = map.getOrDefault(key,0);
            map.put(key,++value);
        }
        map.forEach((k, v) -> System.out.println("Key = " + k + ". Number of repetitions " + v ));
        Integer max = Collections.max(map.values());
        System.out.println("\n" + "Maximum number of repetitions " + max);

    }
}
