package com.telran.homework9.numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumbersGenerator {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            Integer number = random.nextInt(51);
            if (map.containsKey(number)){

                map.put(number, map.get(number) + 1);
            } else{
                map.put(number, 1);
            }
        }
        for (Integer number: map.keySet()) {
            System.out.println(number + " - " + map.get(number));
        }
    }
}
