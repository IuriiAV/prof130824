package com.telran.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedExample {

    public static void main(String[] args) {

        LinkedList<Integer> listOne = new LinkedList<>();

        ArrayList<Integer> listTwo = new ArrayList<>();

        List<Integer> one = new ArrayList<>();
        List<Integer> two = new LinkedList<>();

        printList(one);
        printList(two);
    }

    private static void printList(List<Integer> integers){
        for (Integer value : integers) {
            System.out.println(value);
        }

    }


}
