package com.telran.lesson17StreamApi.OptionalExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptExample {

    public static void main(String[] args) {
//        String fr = getLanguage("fr");
//        if (fr == null) {
//            fr = "en";
//        }
       getLanguage("fr").orElse("en");

    }

    private static Optional<String> getLanguage(String lang) {
        Map<String, String> map = new HashMap();
        map.put("en", "English");
        map.put("de", "German");
        return Optional.of(map.get(lang));
    }
}
