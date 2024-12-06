package com.telran.mylesson9Set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {
        SortedSet<String> stringSortedSet = new TreeSet<>();
        //add - add element

        stringSortedSet.add("D");
        stringSortedSet.add("B");
        stringSortedSet.add("C");
        stringSortedSet.add("A");
        stringSortedSet.add("B");

        System.out.println(stringSortedSet);
        System.out.println("First element " + stringSortedSet.first());
        System.out.println("Last element " + stringSortedSet.last());

        //contains - check that element exists in set
        String c = "C";
        System.out.println("Set contains " + c + " ? " + stringSortedSet.contains(c));

        //remove - remove element
        stringSortedSet.remove("B");
        System.out.println(stringSortedSet);

        //1 - forEach, потому что нет индексов
        for (String value : stringSortedSet) {
            System.out.print(value + " ");
        }

        //2 Iterator
        System.out.println("\nUse Iterator ");

        Iterator<String> iterator = stringSortedSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        //
        System.out.println("\nUse foreach with lambda ");
        stringSortedSet.forEach(value -> System.out.print(value + " "));

        System.out.println();

        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(4);
        integers.add(1);

        System.out.print(integers);

//        SortedSet<Student> students = new TreeSet<>();
//        students.add(new Student());
        System.out.println();

        //[A C D ]
        System.out.println("Tail set: " + stringSortedSet.tailSet("C")); //-> [C, D]
        System.out.println("Head set: " + stringSortedSet.headSet("C")); //-> [A]
        System.out.println("Sub set: " + stringSortedSet.subSet("A", "D")); // -> [A, C]
    }
}
