package com.telran.lesson17StreamApi.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Cat> cats = Arrays.asList(
                new Cat("Bob", 11, true, Color.BLACK),
                new Cat("Tom", 11, false, Color.WHITE),
                new Cat("Murz", 7, true, Color.RED),
                new Cat("Bars", 5, false, Color.BROWN),
                new Cat("Fly", 1, true, Color.BLACK),
                new Cat("Lisa", 15, true, Color.BLACK)
        );

        cats.stream()
                .filter(c -> c.isHungry())
                .filter(c -> c.getAge() > 10)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        cats.stream()
                .map(c -> c.getColor())
                .distinct()
                .forEach(System.out::println);
    }


}
