package com.telran.lesson9;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        //add - add element
        set.add("D");
        set.add("B");
        set.add("A");
        set.add("E");
        set.add("B");

        System.out.println(set);
        // SortedSet : first, last
        System.out.println("First element = " + set.first());
        System.out.println("Last element = " + set.last());

        // contains - check that element exists in set
        String e = "E";
        System.out.println("Set contains " + e + " ? " + set.contains(e));

        //remove - remove element
        set.remove("B");
        System.out.println(set);

        // 1
        System.out.println("Use foreach : ");
        for (String value : set) {
            System.out.print(value + " ");

        //2
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
        }

        //3
        System.out.println("\nUse foreach with lambda");

        System.out.println();

        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(4);
        integers.add(1);
        System.out.println(integers);

        System.out.println("Tail set : " + set.tailSet("D"));
        System.out.println("Head set : " + set.headSet("D"));

        // SortedSet<Student> students = new TreeSet<>();
        //students.add(new Student());
    }
}
