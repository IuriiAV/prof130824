package com.telran.myLesson6;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;

public class ListExampleTwo {

    public static void main(String[] args) {
        AbstractList<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 150; i++) {
            list.add(random.nextInt(50));
        }

        System.out.println(list);
    }

}
