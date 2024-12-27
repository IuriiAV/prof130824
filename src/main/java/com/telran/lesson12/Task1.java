package com.telran.lesson12;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        String st = "ashjdhfhfjffvmnrojfijngijvjijgigj1246yj";
        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            int value = map.getOrDefault(c, 0);
            map.put(c, ++value);

        }

        map.forEach((character, integer) -> System.out.println(character + " " + integer + " "));
    }
}
