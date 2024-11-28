package com.telran.lesson9;

import java.util.SortedSet;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {

        //Set<Integer> setOne = new TreeSet<>();

        SortedSet<String> set = new TreeSet<>();
        set.add("D");
        set.add("B");
        set.add("A");
        set.add("E");
        set.add("B");

        System.out.println(set);
        System.out.println("First element = " + set.first());
        System.out.println("Last element = " + set.last());

        String e = "E";
        System.out.println("Set contains " + e + " ? " + set.contains(e));


    }
}
