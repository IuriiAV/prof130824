package com.telran.mylesson9Set;

import java.util.HashSet;
import java.util.Set;

public class Task {

    public static void main(String[] args) {
        String text = "skdfbskbskbsfbwehoqhwfoqwfashcffjncskdfbskbskbsfbwehoqhwfoqwfashcffjncskdfbskbskbsfbwehoqhwfoqwfash" +
                "cffjnc skdfbskbskbsfbwehoqhwfoqwfashcffjnc skdfbskbskbsfbwehoqhwfoqwfashcffjnc";

        Set<Character> setText = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            setText.add(text.charAt(i));
        }

        System.out.println(setText);
        System.out.println(setText.size());
    }
}
