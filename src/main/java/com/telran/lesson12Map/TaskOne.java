package com.telran.lesson12Map;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {

    public static void main(String[] args) {
        String str = "qwertyuiopqwertyuiopqwe";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int value = map.getOrDefault(c, 0);
            map.put(c, ++value);
        }

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
