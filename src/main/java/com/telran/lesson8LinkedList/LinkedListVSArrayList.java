package com.telran.lesson8LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListVSArrayList {

    public static void main(String[] args) {

        List<Integer> one = new ArrayList<>();
        List<Integer> two = new LinkedList<>();

        long start = System.currentTimeMillis();
        createList(one);
        long end = System.currentTimeMillis();
        System.out.println("Fill ArrayList takes: " + (end - start));

        start = System.currentTimeMillis();
        createList(two);
        end = System.currentTimeMillis();
        System.out.println("Fill LinkedList takes: " + (end - start));

    }

    private static void createList(List<Integer> integerList) {
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            integerList.add(0, r.nextInt(100));
            //integerList.add(r.nextInt(100));
        }
    }
}
