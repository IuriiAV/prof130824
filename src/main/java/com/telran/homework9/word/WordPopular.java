package com.telran.homework9.word;

import java.util.HashMap;
import java.util.Map;

public class WordPopular {
    public static void main(String[] args) {
        String text = "Gerade im Amt und schon präsentiert der" +
                " US Präsident der Welt eine 500 Milliarden Investition im Bereich Künstliche Intelligenz" +
                " Werden die USA durch das Mega Projekt Stargate militärisch unbesiegbar im 21 Jahrhundert";
        Map<String, Integer> map = new HashMap<>();
        String[] s = text.split(" ");
        for (String word : s) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);

            }
        }
        Integer maxCount = 0;
        String maxWord = "";
        for (String word : map.keySet()) {
            System.out.println(word + " - " + map.get(word));
            if (map.get(word) > maxCount) {
                maxCount = map.get(word);
                maxWord = word;
            }
        }
        System.out.println("The most popular word: " + maxWord);
    }
}
