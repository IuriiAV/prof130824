package com.telran.myLesson6;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        //Dynamic Array
        //ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        //add element

        //list.add() - add element in the end of the list

        list.add(2);
        list.add(6);
        list.add(4);
        list.add(15);
        list.add(20);
        list.add(61);
        list.add(23);
        list.add(64);
        list.add(24);
        list.add(65);
        list.add(35);


        System.out.println(list);

        //get()
        int element = list.get(2);
        System.out.println("Element by index 2 is " + element);

        //add element by index
        //time complexity o(n), n - count of elements
        list.add(0, 17);
        System.out.println(list);

        //set element by index - change a value by index
        list.set(0, 0);
        System.out.println(list);

        System.out.println("Size of thr list is " + list.size());

        System.out.println("List is empty? " + list.isEmpty());

        //contains - метод проверки, содержится ли элемент в списке - линейный поиск - простой перебор всех элеентов
        //time complexity o(n) - линейная сложности (неоптимальный для больших листов)
        System.out.println("List contains 20? : " + list.contains(20));

        //remove(index);
        //remove(Object);
        //time complexity o(n) - линейная сложности

        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(6));
        System.out.println(list);

        //for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        for (int value : list) {
            System.out.print(value + " ");
        }

    }
}
