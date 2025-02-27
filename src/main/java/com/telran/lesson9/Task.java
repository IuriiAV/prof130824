package com.telran.lesson9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task {

    public static void main(String[] args) {
        String text = "sdjfbjfbljekhnfldnflaksijfksdjffsfsfvfhfhfhfhfhfhhf";

        Set<Character> setText = new HashSet<>();


        char[] chtext = text.toCharArray();

        for (int i = 0; i <chtext.length ; i++) {
            setText.add(chtext[i]);
        }

        System.out.println(setText);

        System.out.println(setText.size());
    }
}
