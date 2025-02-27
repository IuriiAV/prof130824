package com.telran.lesson9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * List - Линейная структура данных, хранит элементы в порядке добавления
 * Неупорядоченная коллекция уникальных(без повторяющихся ) объектов
 *
 * Interfaces                              Implementations
 * Iterable -> Collection - > Set - > SortedSet - > NavigableSet : TreeSet
 *
 *Interfaces                  Implementations
 * Iterable -> Collection - > Set - > HashSet
 */
public class Theory {

    public static void main(String[] args) {

        // HashSet -- основан на работе хеш таблицы
        // HashSet -> HashMap - > на массиве,  элементами которого являются связные списки

        Set<Integer> setOne = new TreeSet<>();
        Set<Integer> setTwo = new HashSet<>();
    }
}
