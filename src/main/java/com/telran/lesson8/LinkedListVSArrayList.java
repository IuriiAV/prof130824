package com.telran.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListVSArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>();
        LinkedList<Integer> two = new LinkedList<>();

        long start = System.currentTimeMillis(); // from 01.01.1970 03-00
        createList(one);
        long end = System.currentTimeMillis();
        System.out.println("Fill ArrayList takes " + (end-start));

        start = System.currentTimeMillis(); // from 01.01.1970 03-00
        createList(two);
        end = System.currentTimeMillis();
        System.out.println("Fill LinkedList takes" + (end-start) );

    }

    private static void createList(List<Integer> integerList) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            integerList.add(0, random.nextInt(100));
            //integerList.add(random.nextInt(100));
        }
    }
}
