package com.telran.lesson7;

import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        System.out.println(strings);

        Iterator<String> iterator = strings.iterator();
        //hasNext - проверяет что есть еще доступные элементы для обхода
        //next - получает текущий элемент и переходит к следующему
        // -> A B C D E
        String next = iterator.next(); // A
        // A -> B C D E
        String next1 = iterator.next(); // B
        // A  B -> C D E
        String next2 = iterator.next(); // C
        // A  B  C -> D E
        String next3 = iterator.next(); // D
        // A  B  C  D -> E
        String next4 = iterator.next(); // E
        // A  B  C  D  E ->
        System.out.println(next + " " + next1 +" "+next2 + " "+next3 + " "+ next4);
        //String next5 = iterator.next(); здесь элементов нет и будет ошибка

        Iterator<String> iteratorTwo = strings.iterator();
        while (iteratorTwo.hasNext()) {
            String value = iteratorTwo.next();
            System.out.print( value +" ");
        }
        System.out.println();

        printElements(new ArrayList<String>().iterator());
        printElements(new HashSet<String>().iterator());
        printElements(new ArrayDeque<String>().iterator());
    }

    private static void printElements(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.print( value +" ");
        }
    }
}

