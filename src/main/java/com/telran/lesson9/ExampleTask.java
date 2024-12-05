package com.telran.lesson9;

import java.util.HashSet;
import java.util.Set;

public class ExampleTask {

    public static void main(String[] args) {
        String text = "dlknsdjnsjgnfjgbfkgjsfkgsfglfglkjfdlgkjsfklgjsdfg";
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            //Если элемент добавлен, то будет возвращено true
            //если в сете уже есть такой элемент и новый не будет добавлен
            //то метод add вернет false
            if(!set.add(c)) {
                count++;
            }
        }
        System.out.println(set);
        System.out.println("Number of duplicates = " + count);
    }
}
