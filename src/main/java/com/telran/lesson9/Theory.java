package com.telran.lesson9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * List - Линейная структура данных, хранит элементы в порядке добавления
 *
 * Set - Неупорядоченный набор элементов, это набор уникальных элементов
 * Неупорядоченная коллекция уникальных(без повторяющихся) объектов
 *
 *                  Interfaces                          Implementations
 * Iterable-> Collection-> Set-> SortedSet-> NavigableSet : TreeSet
 *
 *             Interfaces       Implementations
 * Iterable-> Collection-> Set-> HashSet
 */
public class Theory {

    public static void main(String[] args) {
        //TreeSet -- хранит только уникальные элементы, добавляет сортировку элементов
        //TreeSet -- основа этого класса красно черное самобалансирующееся дерево
        //TreeSet -> TreeMap -> красно-черное самобалансирующееся дерево
        //add(value), remove(value), contains(value) - O(log n)
        //сортировка элементов происходит после каждой операции добавления, удаления

        //HashSet -- хранит только уникальные элементы, хранит хаотично)
        //HashSet -- основан на работе хеш таблицы
        //HashSet -> HashMap -> на массиве, элементами которого являются связные списки
        //add(value), remove(value), contains(value) - O(1)

        Set<Integer> setOne = new TreeSet<>();
        Set<Integer> setTwo = new HashSet<>();

    }
}
