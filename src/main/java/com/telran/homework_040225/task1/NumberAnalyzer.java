package com.telran.homework_040225.task1;

import java.util.List;

/**
 * Задача 1
 * Напишите класс NumberAnalyzer, который:
 * Принимает список чисел (List).
 * Вычисляет максимальное, минимальное и среднее значение в списке.
 * Если список пустой, выбрасывает исключение IllegalArgumentException с сообщением "List cannot be empty".
 * <p>
 * JUnit-тесты:
 * <p>
 * <p>
 * Проверить, что getMax() возвращает правильное максимальное число.
 * Проверить, что getMin() возвращает правильное минимальное число.
 * Проверить, что getAverage() считает среднее.
 * Проверить, что при пустом списке выбрасывается IllegalArgumentException.
 * Использовать параметризованные тесты для разных входных данных.
 */
public class NumberAnalyzer {

    private List<Integer> numbers;

    //Конструктор
    public NumberAnalyzer(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        this.numbers = numbers;
    }

    //Метод max
    public int getMax() {
        return numbers.stream().max(Integer::compare).orElseThrow();
    }

    //Метод Мин
    public int getMin() {
        return numbers.stream().min(Integer::compare).orElseThrow();
    }

    //Метод среднего значения
    public double getAverage() {
        return numbers.stream().mapToInt(Integer::intValue).average().orElseThrow();
    }
}
