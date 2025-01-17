package com.telran.lesson10.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);

        System.out.println("Before sort " + list);
        Collections.sort(list);
        System.out.println("After sort " + list);
    }
}
