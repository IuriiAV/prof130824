package com.telran.lesson17;

import java.util.HashMap;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;


public class OptionalExample {

    public static void main(String[] args) {
////        String fr = getLanguage("fr");
////        if (fr == null){
////            fr = "en";
//    }

        String fr = getLanguage("fr").orElse("en");
        getLanguage("lt").orElseThrow(()-> new NoSuchElementException());
        System.out.println(fr.toUpperCase());

        printLanguage(getLanguage("fr").orElse("en"));

        String de = getLanguage("de").get();


        Integer integer = Stream.of(5, 6, 48, 9)
                .filter(x -> x < 3)
                .findAny().orElse(0);
        System.out.println(integer.toString());
    }

    private static void printLanguage(String language){
        System.out.println(language.toUpperCase());
    }

    private static Optional<String> getLanguage(String language) {
        Map<String,String> map = new HashMap<>();
        map.put("en","en");
        map.put("de","de");
        return Optional.ofNullable(map.get(language));
    }
}
