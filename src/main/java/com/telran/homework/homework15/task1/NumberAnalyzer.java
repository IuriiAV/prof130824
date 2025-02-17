package com.telran.homework.homework15.task1;

import java.util.Collections;
import java.util.List;

import java.util.*;

public class NumberAnalyzer {
    private final List<Integer> integers;

    public NumberAnalyzer(List<Integer> integers) throws IllegalArgumentException {
        Objects.requireNonNull(integers, "List cannot be null");
        if (integers.isEmpty()) throw new IllegalArgumentException("List cannot be empty");
        this.integers = integers;
    }

    public int getMax() {
        return Collections.max(integers);
    }

    public int getMin() {
        return Collections.min(integers);
    }

    public int getAverage() {
        Integer sum = integers.stream().reduce(0, Integer::sum);
        return sum / integers.size();
    }
}

//Напишите класс NumberAnalyzer, который:
//Принимает список чисел (List).
//Вычисляет максимальное, минимальное и среднее значение в списке.
//Если список пустой, выбрасывает исключение IllegalArgumentException с сообщением "List cannot be empty".
//
//JUnit-тесты:
//
//
//Проверить, что getMax() возвращает правильное максимальное число.
//Проверить, что getMin() возвращает правильное минимальное число.
//Проверить, что getAverage() считает среднее.
//Проверить, что при пустом списке выбрасывается IllegalArgumentException.
//Использовать параметризованные тесты для разных входных данных.