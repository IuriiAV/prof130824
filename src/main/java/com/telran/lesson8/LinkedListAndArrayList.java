package com.telran.lesson8;

import java.util.LinkedList;
import java.util.List;

public class LinkedListAndArrayList {

    public static void main(String[] args) {

        List<Integer> integerList = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }

        for (Integer value : integerList) {
            System.out.println(value + " ");
        }

        LinkedList<String> strings =new LinkedList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");

        strings.addLast("Four");
        strings.addFirst("Five");

        String last = strings.getLast();
        String first = strings.getFirst();
        String i = strings.get(2);

        String s1 = strings.removeFirst();
        System.out.println(s1);



    }
}
