package com.telran.lesson9;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        // Порядка хранения элементов для нас нет!!


        Set<String> set = new HashSet<>();
        set.add("A"); // hashcode = 1
        set.add("D"); // 6
        set.add("F"); // 5
        set.add("D"); // 4
        set.add("c"); // 3
        set.add("B"); // hashcode = 2

        System.out.println(set);
        boolean contains = set.contains("F");
        System.out.println("Set contains F " + contains);
    }
}
