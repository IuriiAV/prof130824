package com.telran.lesson8LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListANDArrayList {

    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }

        for (Integer value : integerList){
            System.out.println(value + " ");
        }

        LinkedList<String> strings = new LinkedList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");

        strings.addFirst("First");
        strings.addLast("Last");

        String last = strings.getLast();
        String first = strings.getFirst();
        String s = strings.get(4);


    }
}
