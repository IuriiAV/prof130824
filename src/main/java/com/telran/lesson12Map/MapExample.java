package com.telran.lesson12Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * (Previous : List -> value, Set -> value, Queue -> value)
 * Map :
 * одно значение в мапе это пара элементов - key : value
 * пара неделимая, какому-то ключу соответствует свое значение
 * Map - interface -> HashMap -> LinkedHashMap
 * Map -> SortedMap -> TreeMap
 * ConcurrentHashMap : для параллельной работы
 * <p>
 * put(key, value) - помещает пару в мапу
 * Значение в мапу помещается по ключу :
 * map.put("apple",100); - по ключу "apple" помещается значение 100
 * <p>
 * Для получения значения по ключу используется метод get(key) (value = get(key))
 * в параметры передается ключ, возвращается значение
 * Key - уникальное значение, дублей быть не может
 * (если по одному ключу положить несколько значений, то сохраниться только последнее)
 * Ключ в мапе - это и есть тот обьект,
 * у которого вычисляется hashcode и на основании которого ищется место во внутреннем массиве куда положить пару
 * <p>
 * Значения по разным ключам могут быт дублирующие
 * <p>
 * put, get, containsKey - time complexity O(1)
 * <p>
 * null может быть ключом в мапе (у null хэшкод не считаетлся, все null помещаются во внутренний массив table[0])
 */
public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //goods : price
        //apple - 100
        //pineapple - 150
        //lemon - 50
        //carrot - 20

        map.put("apple", 100);
        map.put("pineapple", 150);
        map.put("lemon", 50);
        map.put("carrot", 20);

        System.out.println(map);

        Integer carrotPrice = map.get("carrot");
        System.out.println("Carrot price is " + carrotPrice);
        map.put("carrot", 50);

        System.out.println(map);

        map.forEach((k, v) -> System.out.println("Pair : key"));

        Set<String> set = new HashSet<>();
        set.add("o");
    }
}
