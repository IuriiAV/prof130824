package com.telran.lesson12;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {

    public static void main(String[] args) {
        String st = "asdd  ffgih.xdjbngx.öxchc2345   56yrxcvbhnjomkpl,lknjbhvg";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < st.length(); i++) {
            int value = map.getOrDefault(st.charAt(i), 0);
            map.put(st.charAt(i), ++value);
        }
        map.forEach((character, integer) -> System.out.print(character + " " + integer + " "));
    }
}
