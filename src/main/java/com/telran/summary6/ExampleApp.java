package com.telran.summary6;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleApp {

    public static void main(String[] args) {

        Supplier<Person> person = () -> {
            Faker faker = new Faker();
            return new Person(faker.name().firstName(), faker.name().lastName(), faker.number().randomDigit(), faker.random().nextInt(0, 10));
        };
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(person.get());
        }
        System.out.println(list);
        System.out.println();
        Predicate<Person> filterByRate = (p) -> p.getRate() > 5;

        System.out.println(filter(list, filterByRate));
        System.out.println();
        System.out.println(getIDS(list));


    }
    private static List<Integer> getIDS(List<Person> people) {
        List<Integer> list = new ArrayList<>();
        Function<Person,Integer> getID = (p) -> p.getId();
        for (Person person : people){
            list.add(getID.apply(person));

        }


        return list;
    }


    private static List<Person> filter(List<Person> people, Predicate<Person> filter) {
        List<Person> list = new ArrayList<>();

        for (Person person : people) {
            if (filter.test(person)) {
                list.add(person);
            }
        }
        return list;
    }
}
