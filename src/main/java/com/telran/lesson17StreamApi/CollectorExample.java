package com.telran.lesson17StreamApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1l, "Alex", "Alexeev"),
                new Person(2l, "Petr", "Petrov"),
                new Person(2l, "Zoz", "Zooooz")
        );

        //key -> value
        //Alex -> Alexeev

        //key -> value
        //1 -> Person

        Map<String, String> map = new HashMap<>();
        for (Person person : people) {
            map.put(person.getName(), person.getSurname());
        }

        //key -> value
        //Alex -> Alexeev
        Map<String, String> collect = people.stream()
                .collect(Collectors.toMap(person -> person.getName(), person -> person.getSurname()));

        Map<Long, Person> mapTwo = new HashMap<>();
        for (Person person : people) {
            mapTwo.put(person.getId(), person);
        }

        Map<Long, Person> collect1 = people.stream()
                .collect(Collectors.toMap(person -> person.getId(), Function.identity()
                        , (first, second) -> second)); // если попадается дублирующий ключ

        System.out.println(collect);
        System.out.println(collect1);

        //собирает из набора элементов строку
        String[] strings = {"Hello", "Java"};
        Arrays.stream(strings).collect(Collectors.joining());
        Arrays.stream(strings).collect(Collectors.joining(" "));
        Arrays.stream(strings).collect(Collectors.joining(" ", "[", "]"));

        String[] strings1 = {"one", "two", "three", "four", "eight"};
        Map<Integer, List<String>> collect2 = Arrays.stream(strings1)
                .collect(Collectors.groupingBy(str -> str.length(), Collectors.toList()));

        System.out.println(collect2);

    }
}
