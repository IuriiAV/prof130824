package com.telran.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CatApp {

    public static void main(String[] args) {
        List<Cat> cats = Arrays.asList(
                new Cat("Bob", 12, true,Color.Black),
                new Cat("Alex", 11, false,Color.White),
                new Cat("Tom", 12, true,Color.Brown),
                new Cat("Max", 13, false,Color.Red),
                new Cat("Lisa", 7, true,Color.Black),
                new Cat("Carl", 16, true,Color.White),
                new Cat("Big", 17, false,Color.Brown),
                new Cat("Bob", 9, true,Color.Red)
        );

        List<Cat> collect = cats.stream().
                filter(cat -> cat.getAge() > 10)
                .filter(Cat::isHungry)
                .collect(Collectors.toList());

        System.out.println(collect);

        List<Color> collect1 = cats.stream()
                .map(Cat::getColor)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
