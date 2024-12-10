package com.telran.lesson12Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExampleThree {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "hello");
        map.put(4, "Hi");
        map.put(1, "Hallo");

        //check if map contains key (операции через хэшкод, поэтому O(1))
        boolean result = map.containsKey(5);
        System.out.println("map contains 5? " + result);

        //check if map contains value (как минимум линейная сложность) O(n) or O(n^2)
        boolean hi = map.containsValue("Hi");
        System.out.println("Map contains hi? " + hi);

        //get set of all keys
        Set<Integer> integerSet = map.keySet();

        //get all values
        Collection<String> values = map.values();

        if (map.containsKey(10)) {
            String s = map.get(10);
            System.out.println(s);
        }



    }
}
