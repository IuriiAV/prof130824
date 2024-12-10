package com.telran.lesson12;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("apple", 100);
        map.put("pineapple", 150);
        map.put("lemon", 50);
        map.put("carrot", 20);

        System.out.println(map);

        Integer carrotPr = map.get("carrot");
        System.out.println(carrotPr);

    }
}
