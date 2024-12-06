package com.telran.lesson8LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> listOne = new LinkedList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        List<Integer> one = new LinkedList<>();
        List<Integer> two = new ArrayList<>();

        printtList(one);
        printtList(two);

        //ArrayList - consists of array
        //LinkedList - objects are linked with each other
    }

    private static void printtList(List<Integer> integers) {
        for (Integer value : integers) {
            System.out.println(value);
        }
    }
}
