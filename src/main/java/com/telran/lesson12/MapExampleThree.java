package com.telran.lesson12;

import java.util.*;

public class MapExampleThree {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Hello");
        map.put(4, "Hi");
        map.put(1, "Hallo");

        boolean result = map.containsKey(5);  // 0(1)
        System.out.println("5 contains in map : " + result);

        boolean hi = map.containsValue("Hi"); // 0(n) or 0(n^2)
        System.out.println("Hi contains in map : " + hi);

        // get all keys
        Set<Integer> integerSet = map.keySet();

        // get all values
        Collection<String> values = map.values();



        if (map.containsKey(10)) {
        String value = map.get(10);
        System.out.println(value);

    }

    }


}
