package com.telran.summarythree;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Имеется список уникальных слов. Написать метод сортировки списка слов через Set.
 * Оценить алгоритмическую сложность такой сортировки по времени и памяти.
 *
 */
public class TaskExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("two","one","three","four");
        System.out.println("List before = " + strings);
        sortList(strings);
        System.out.println("List after = " + strings);
    }

    private static void sortList(List<String> strings){
        //Space complexity = O(n)
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < strings.size(); i++) {//n
            String s = strings.get(i); // O(1) * n
            set.add(s); //O(log n) * n

        }

        //Time complexity = O(n)
        //Space complexity = O(1)
        int index = 0;
        for (String s : set) { // n
            strings.set(index++, s); // O(1)

        }

        // Space O(n) + O(1) = O(n)
        //Time O(1)*n + O(log)n = O (n logn) * O(n) = O(n logn)
    }
}
