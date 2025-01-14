package com.telran.homework9;

import java.util.HashMap;
import java.util.Map;

/**
 * Загрузить в строку текст (скопируйте пару страниц из книги),
 * найдите самое популярное слово в этом тексте, за исключением пробела
 */

public class MostPopularWord {

    public static void main(String[] args) {
        String text = "In many primitive societies, people were often afraid that the end of the world was coming. The Apocalypse; Armageddon. it has had several names. Kings, priests and other important people used the end of the world as a threat, to keep people and followers under control. Today some gurus, politicians and influencers do the same. So has anything changed? In primitive societies, people did not know a lot about the Earth, and they knew even less about the Universe. Until modern times, most people thought that the earth was flat. Some still do! Yet today, scientists know a great deal about the Earth and about the Universe. They can study and understand the problems that we face, they can explore the past, and they can look into the future. And they understand that the Earth is now facing some very big problems. There are four big problems: population, climate change, war, and diseases. Any one of them could cause a global catastrophe, and the end of the world, or at least the end of civilisation. Some people talk about a fifth problem - asteroids! If a big asteroid hits the Earth, this could destroy most life on the planet. It has happened before. We now know that the age of the dinosaurs ended after a massive asteroid hit the Earth. But scientists also know that no massive asteroids will hit the earth in the 21st century. A medium asteriod, called Apophis, will perhaps hit the earth in 2029 or 2046. If it does, it will cause damage, but it won't cause the end of the world. Population, disease, war and climate change are much bigger problems. In the year 2000 the world's population was \"just\" 6.2 billion. In 2080, it will be over 10 billion! We all know that Earth's climate is changing. Climates have changed before, but today's climate change is faster than in the past, and is largely due to human activity. More people create more activity, more waste, more CO², and more risk for the planet. Governments are trying to slow down climate change, but they are not being very successful.";
        String noPunctuation = text.replaceAll("\\p{Punct}", "").toLowerCase();
        Map<String, Integer> usedWords = new HashMap<>();
        String[] words = noPunctuation.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count = usedWords.getOrDefault(word, 0);
            usedWords.put(word, ++count);
        }

        Integer max = 0;
        String mostFrequentWord = null;

        for (String word : usedWords.keySet()) {
            if (usedWords.get(word) > max) {
                max = usedWords.get(word);
                mostFrequentWord = word;
            }
        }
        System.out.println("'" + mostFrequentWord + "' is the most frequently used word, used " + max + " times");
    }
}
