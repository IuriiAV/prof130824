package com.telran.lesson17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1l, "Alex", "Alexeev"),
                new Person(2l, "Petr", "Petrov"),
                new Person(2l, "Oleg", "Olegov")
        );

        //key -> value
        // Alex -> Alexeev
        Map<String, String> map = new HashMap<>();
        for (Person person : people) {
            map.put(person.getName(), person.getSurname());
        }


        //key -> value
        // 1 ->  new Person(1l,"Alex", "Alexeev"),
        Map<Long, Person> mapTwo = new HashMap<>();
        for (Person person : people) {
            mapTwo.put(person.getID(), person);
        }
        System.out.println(mapTwo);

        Map<String,String> collect = people.stream()
                .collect(Collectors.toMap(person -> person.getName(),
                        person -> person.getSurname()));
        System.out.println(collect);

        Map<Long,Person> collect1 = people.stream()
                .collect(Collectors.toMap(person -> person.getID(),
                        Function.identity(),(first,second) -> second));

        System.out.println(collect1);

        String[] strings = {"Helo", "Java"};
        String result = Arrays.stream(strings).collect(Collectors.joining(" ", "+","-"));
        System.out.println(result);

        String[] strings1 = {"one","two","three","four","eight"};
        Map<Integer, List<String>> collect2 = Arrays.stream(strings1)
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.toList()));

        System.out.println(collect2);
    }
}