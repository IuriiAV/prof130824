package com.telran.homeworks.homework9;

import java.util.HashMap;
import java.util.Map;

public class MostPopularWordFinder {

    public static void main(String[] args) {

        String text = "Replace this with the text from a book. This is just an example text with some repeated words. Replace this with a longer text.";





        String[] words = text.split("\\s+");


        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }


        String mostPopularWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostPopularWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }


        System.out.println("Most popular word: " + mostPopularWord);
        System.out.println("Occurrences: " + maxCount);
    }
}
