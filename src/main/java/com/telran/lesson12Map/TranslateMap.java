package com.telran.lesson12Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TranslateMap {

    public static void main(String[] args) {
        System.out.println("1 - eng, 2 - german, 3 - french");
        Scanner scanner = new Scanner(System.in);
        System.out.println(getGreeting(scanner.nextInt()));
        scanner.close();
    }

    private static String getGreeting(int lang){
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Hallo");
        map.put(3, "Bonjour");

        String greeting = map.getOrDefault(lang, "Hello");

        return greeting;
    }
}
