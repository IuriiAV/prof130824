package com.telran.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * stream() - создание потока у любой коллекции
 * <p>
 * Intermediate - (промежуточная) конвеерные операции, они могут идти подряд друг за другом
 * количество таких команд не ограничено
 * <p>
 * После оператора stream мы получаем поток данных, но и после каждой
 * промежуточной операции, мы то же получаем поток данных и только
 * после терминальной операции мы получаем результат
 * <p>
 * Terminal - конечная операция, без нее никакой набор команд стрима не будет
 * выполнен
 * <p>
 * collection.stream().Intermediate.Intermediate....Intermediate.Terminal
 *
 * Любые изменения стрима, не изменяют оригинальный набор данных
 *
 *
 *
 * Intermediate :
 * filter(predicate) - filter for elements
 * sorted() - sort stream
 * skip(n) - skip n elements
 * limit(n) - limit n elements
 * distinct - only unique elements
 * peek(consumer) - any action for every element
 * map(function) - convert elements
 * flatmap(function)
 *
 * Terminal :
 * count() - count elements in stream
 * collect - collect elements to Collection, String ... etc
 * foreach(consumer) - any action for every element
 * findFirst() - get first element (optional type)
 */

public class StreamApiExampleTwo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "20", "1", "15", "20", "10", "50", "25");
        long count = list.stream().count();
        System.out.println("Count = " + count);
        //"20"
        int count20 = 0;
        for (String str : list) {
            if (str.equals("20")) {
                count20++;
            }
        }

        //filter
        //list.stream() <data stream> ->
        //<data stream> -> .filter(predicate). -> <data stream>

        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "20".equals(s);
            }
        };
        long count1 = list.stream().filter(stringPredicate).count();
        System.out.println("Count of 20 is = " + count1);

        Predicate<String> stringPredicateAsLambda = s -> "20".equals(s);
        long count2 = list.stream().filter(stringPredicateAsLambda).count();
        System.out.println("Count of 20 is = " + count2);

        long count3 = list.stream().filter(s -> "20".equals(s)).count();
        System.out.println("Count of 20 is = " + count3);

        //collect
        //filter list , string startsWith("1") and add to new list
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            if (value.startsWith("1")) {
                newList.add(value);
            }
        }

        List<String> collect = list.stream()
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());

        //sorted()
        List<String> collect1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list " + collect1);
        //List<String> strings = list.stream().toList();

        //skip
        System.out.println(list);
        List<String> collect2 = list.stream().skip(3).collect(Collectors.toList());
        System.out.println(collect2);

        //limit
        System.out.println(list);
        List<String> collect3 = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(collect3);

        /*
        select
        *
        from employees
        where salary = (
                          select
                            t1.salary from (
                                            select
                                            salary
                                            from employees
                                            order by salary desc
                                            limit 3) as t1
                            order by t1.salary
                            limit 1);
       */

        List<String> collect4 = list.stream().sorted().limit(1).collect(Collectors.toList());
        System.out.println(collect4);

        //distinct
        List<String> collect5 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect5);

        //peek
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s  + " ");
            }
        };

        List<String> collect6 = list.stream().peek(stringConsumer).sorted()
                .peek(stringConsumer)
                .filter(s -> s.startsWith("1"))
                .peek(stringConsumer)
                .collect(Collectors.toList());
        System.out.println(collect6);

        //foreach
        list.stream().sorted()
                .filter(s -> s.startsWith("1"))
                .forEach(s -> System.out.print(s + " "));

    }

    private List<String> getFilteredList(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            if (value.startsWith("1")) {
                newList.add(value);
            }
        }
        return newList;
    }

    private List<String> getFilteredListUseStream(List<String> list) {
        return list.stream()
                .filter(str -> str.startsWith("1"))
                .collect(Collectors.toList());
    }
}