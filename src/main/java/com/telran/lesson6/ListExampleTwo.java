package com.telran.lesson6;

import java.util.ArrayList;
import java.util.Random;

public class ListExampleTwo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 150; i++) {

            list.add(random.nextInt(50));
        }

        System.out.println(list);


        int element = list.get(2);
        System.out.println("Element by index 2 = " + element);
    }
}
