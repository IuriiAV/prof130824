package com.telran.homeworks.homework13;
/**
 * Напишите класс NumberAnalyzer, который:
 * Принимает список чисел (List).
 * Вычисляет максимальное, минимальное и среднее значение в списке.
 * Если список пустой, выбрасывает исключение IllegalArgumentException с сообщением "List cannot be empty".
 *
 * JUnit-тесты:
 *
 *
 * Проверить, что getMax() возвращает правильное максимальное число.
 * Проверить, что getMin() возвращает правильное минимальное число.
 * Проверить, что getAverage() считает среднее.
 * Проверить, что при пустом списке выбрасывается IllegalArgumentException.
 * Использовать параметризованные тесты для разных входных данных.
 */

import java.util.List;

public class NumberAnalyzer {
    private final List<Integer> numbers;


    public NumberAnalyzer(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        this.numbers = numbers;
    }


    public int getMax() {
        return numbers.stream().max(Integer::compare).orElseThrow();
    }


    public int getMin() {
        return numbers.stream().min(Integer::compare).orElseThrow();
    }


    public double getAverage() {
        return numbers.stream().mapToInt(Integer::intValue).average().orElseThrow();
    }
}
