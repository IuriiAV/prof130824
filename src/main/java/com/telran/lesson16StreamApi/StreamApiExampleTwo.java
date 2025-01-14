package com.telran.lesson16StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * stream() - создание потока у любой коллекции
 * <p>
 * Intermediate - конвеерные операции, они могут идти подряд друг за другом
 * количество таких команд не ограничено
 * <p>
 * После оператора stream мы получаем поток данных, но и после каждой
 * промежуточной операции мы тоже получаем поток данных,
 * и только после терминальной оперции мы получаем результат
 * <p>
 * Terminal - конечная операция, без нее никакой набор команд стрима не будет выполнен
 * <p>
 * collection.stream().Intermediate.Intermediate.Intermediate.Intermediate.Terminal
 * <p>
 * Любые изменеия стрима не изменяют оригинальный набор данных
 * <p>
 * Intermediate:
 * filter(predicate) - filter
 * sorted() - sort elements
 * skip(n) - skip n elements
 * limit()
 * distinct() - only unique elements
 * peek(Consumer) - применяет действие к каждому элементу стрима
 * map(Function) - конвертирует элементы -
 * flatmap
 *
 * <p>
 * Terminal:
 * count() - count elements in stream
 * collect() - позволяют собирать стрим в коллекцию, строку и т.д
 * foreach(Consumer)
 * findFirst - get first element (optional type)
 * findAny - get any (optional)
 * max(comparator), min(comparator)
 */

public class StreamApiExampleTwo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "20", "1", "15", "20", "10", "50", "25");
        long count = list.stream().count();
        System.out.println("count = " + count);

        //count fa number of "20"
        long count1 = list.stream().filter(s -> "20".equals(s)).count();
        System.out.println("count1 = " + count1);

        //filter
        //list.stream() <data stream>
        // <data stream> .filter(predicate). -> <data stream>

        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "20".equals(s);
            }

        };

        long count3 = list.stream().filter(s -> "20".equals(s)).count();
        System.out.println("Count of 20 is = " + count3);

        //collect
        list
                .stream()
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());

        //sorted()
        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list: " + collect);

        //skip - skip n first elements
        list.stream().skip(3).collect(Collectors.toList());
        System.out.println(collect);

        //limit
        System.out.println(list);
        List<String> list1 = list.stream().sorted().limit(3).toList();

        System.out.println(list1);

        List<String> limit = list.stream().sorted().limit(1).toList();
        System.out.println(limit);

        List<String> collect2 = list.stream().distinct().toList();
        System.out.println("only unique elements: " + collect2);

        //peek()
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + " ");
            }
        };
        List<String> collect1 = list.stream().peek(stringConsumer)
                .sorted()
                .peek(stringConsumer)
                .filter(s -> s.startsWith("1"))
                .peek(stringConsumer)
                .collect(Collectors.toList());

        list.stream()
                .sorted()
                .filter(s -> s.startsWith("1"))
                .forEach(s -> System.out.print(s + " "));

    }

    private List<String> getFilteredList(List<String> list) {
        return list
                .stream()
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
    }
}
