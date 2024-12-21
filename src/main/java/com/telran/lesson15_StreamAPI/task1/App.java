package com.telran.lesson15_StreamAPI.task1;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

    public static void main(String[] args) {

        Supplier<Person> person = () -> {
            Faker faker = new Faker();
            return new Person(faker.number().randomDigitNotZero()
                    , faker.name().firstName(), faker.name().lastName(), faker.random().nextInt(0, 10));
        };

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            people.add(person.get());
        }

        System.out.println(people);

        System.out.println();

        Predicate<Person> filterByRate = (p) -> p.getRate() > 5;

        System.out.println(filter(people, filterByRate));

        System.out.println();
        System.out.println(getIds(people));
    }

    private static List<Integer> getIds(List<Person> people) {
        List<Integer> list = new ArrayList<>();
        Function<Person, Integer> getid = (person) -> person.getId();

        for (Person person : people) {
            list.add(getid.apply(person));
        }
        return list;
    }

    private static List<Person> filter(List<Person> people, Predicate<Person> filter) {
        List<Person> personList = new ArrayList<>();

        for (Person person : people) {
            if (filter.test(person)) {
                personList.add(person);
            }
        }

        return personList;
    }
}
