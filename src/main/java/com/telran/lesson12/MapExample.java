package com.telran.lesson12;

import java.util.*;

/**
 * (Previous : List -> value, Set -> value, Queue -> value)
 * Map :
 * Одно значение в мапе это пара элементов: key -> value
 * Пара неделимая, одному ключу соответствует свое значение
 * Map -> HashMap -> LinkedHashMap
 * Map -> SortedMap -> TreeMap
 * для параллельной работы -> ConcurrentHashMap
 * <p>
 * put(key, value) - помещает пару в мапу
 *
 * Значение в мапу помещается по ключу:
 * map.put("apple", 100); - это значит, что по ключу "apple"
 * помещается значение 100
 *
 * Для получения значения по ключу используется метод
 * value = get(key), в параметры метода передается ключ,
 * ответом будет то значение, что есть по ключу
 *
 * Ключ это уникальное значение - дублей быть не может
 * Ключ в мапе это и есть тот объект, у которого вычисляется
 * hashcode и на основании которого ищется место во внутреннем
 * массиве куда положить нашу пару
 *
 * Значения по разным ключам могут быть одинаковые
 *
 * put, get, containsKey - Time complexity O(1)
 *
 * null -может быть ключом в мапе
 * помещается всегда во внутренний массив table[0]
 *
 */
public class MapExample {

    public static void main(String[] args) {
        //List<String>
        //key -> String, value -> Integer
        Map<String, Integer> map = new HashMap<>();
        // goods : price
        // apple - 100
        // pineapple - 150
        // lemon - 50
        // carrot - 20

        map.put("apple", 100);
        map.put("pineapple", 150);
        map.put("lemon", 50);
        map.put("carrot", 20);

        System.out.println(map);

        int carrotPrice = map.get("carrot");
        System.out.println("Carrot price is " + carrotPrice);

        map.put("carrot", 50);
        System.out.println("Carrot price is " + map.get("carrot"));
        System.out.println(map);

        //for(Type param : collection)
        for(Map.Entry<String,Integer> pair  : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println("Pair : key = " + key +", value = " + value);
        }

        map.forEach((k,v) -> System.out.println("Pair : key = " + k +", value = " + v));

        Set<String> set = new HashSet<>();
        set.add("Hello");

        Set<String> treeSet = new TreeSet<>();
    }
}
