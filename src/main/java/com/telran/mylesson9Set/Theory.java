package com.telran.mylesson9Set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * List - Линейная структура данных, хранит элементы в порядке добавления
 * <p>
 * Set - неупорядоченный набор УНИКАЛЬНЫХ элементов
 * <p>
 *     Interfaces                                               Implementations
 * Iterable -> Collection -> Set -> SortedSet -> NavigableSet : TreeSet
 * Interfaces                      Implementations
 * Iterable -> Collection -> Set : HashSet
 * hashcode - целое уникальное число, которым можно предствить любой обьект
 */
public class Theory {

    public static void main(String[] args) {
        //TreeSet -- хранит только уникальные элементы, добавляет сортировку
        //TreeSet -- основан на красно-черном самобалансирующемся дереве
        //TreeSet -> TreeMap -> красно-черное самобалансирующееся дерево
        //add(value), remove(value), contains(value)... O(log n)

        //HashSet -- хранит только уникальные элементы, хранит хаотично
        //HashSet -- основан на хэш таблице
        //HashSet  -> HashMap -> массив, элементами корого являются связные списки
        //add(value), remove(value), contains(value) - O(1)

        SortedSet<Integer> setOne = new TreeSet<>();
        Set<Integer> setTwo = new HashSet<>();
    }

}
