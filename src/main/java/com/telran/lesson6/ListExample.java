package com.telran.lesson6;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        // Dynamic Array
        // ArrayList - реализация структуры данных динамического массива в Java
        // внутри класса ArrayList есть обычный массив типа Object[] elementData
        // при создании ArrayList, создается внутренний массив размером 10 элементов

        //структура данных Dynamic Array, но называем его список, лист, аррей лист
        //еще одно понятие списка - список значений
        ArrayList<Integer> list = new ArrayList<>(); // array size 10

        // add element to array : Time complexity O(1)
        // array[1] = 2;

        // add element to list (to end)  : Time complexity O(1)
        // add(value) - добавляем элемент в конец нашего списка

        list.add(3);  // elementData[0] = 3;
        list.add(6);  // elementData[1] = 6;

        //Элементы внутри списка хранятся в порядке добавления их в список
        System.out.println(list);

        list.add(5); // elementData[2] = 5;
        list.add(3); // elementData[3] = 3;
        list.add(2); // elementData[4] = 2;
        list.add(5); // elementData[5] = 5;
        list.add(7); // elementData[6] = 7;
        list.add(6); // elementData[7] = 6;
        list.add(7); // elementData[8] = 7;
        list.add(9); // elementData[9] = 9;
        // При попытке добавить элемент в массив, который оказался полностью заполнен
        // 1) внутри класса ArrayList был создан новый массив в отдельной переменной
        // в 1,5 раза больше чем текущий,в данном случае из 15 элементов
        // 2) Все элементы старого массива были скопированы в новый массив
        // в нашем случае - получили новый массив из 15 элементов, 10 из которых
        // заполнены из старого массива
        //
        // 3) В переменную elementData, которая хранит массив в классе ArrayList
        // была присвоена ссыла на новый массив из 15 элементов
        // 4) Все ссылки на старый массив были очищены и он стал доступен для удаления

        list.add(6); // c[10] = 6;
        list.add(1); // elementData[11] = 1;
        list.add(8); // elementData[12] = 8;

        //list.trimToSize();

        System.out.println(list);

        // get element from array : c
        // int element = array[1];

        // get element from list by index  : Time complexity O(1)
        // get(index) - получаем элемент из списка по индексу

        int element = list.get(2);
        System.out.println("Element by index 2 = " + element);

        // add element by index : Time complexity O(n) , n - count of elements
        // [3, 6, 5, 3, 2, 5, 7, 6, 7, 9, 6, 1, 8]
        // [3, 6, 5, 3, 2, 5, 7, 6, 7, 9, 6, 1, 8, 0 , 0, 0, 0]
        // [15, 3, 6, 5, 3, 2, 5, 7, 6, 7, 9, 6, 1, 8, 0 , 0, 0, 0]

        // add(index, value) - добавление элемента по индексу
        list.add(0, 15);
        System.out.println(list);

        //set element by index : Time complexity O(1)
        list.set(0, 25); // перезаписать элемент по индексу
        System.out.println(list);

        System.out.println("Size out list " + list.size());
        System.out.println("List is empty ? " + list.isEmpty());

        //contains - метод проверки содержания элемента в списке(перебор всех элементов и поиск)
        //Time complexity O(n) , n - count of elements
        System.out.println("List contains 9 ? " + list.contains(9));

        //remove(index) -  удаление по индексу Time complexity O(n) , n - count of elements
        //remove(Object) - удаление объекта    Time complexity O(n) , n - count of elements
        //remove(1) - удалить элемент по индексу 1
        // [3, 6, 5, 3, 2, 5, 7, 6, 7, 9, 6, 1, 8]
        // [3, 5, 3, 2, 5, 7, 6, 7, 9, 6, 1, 8, null]

        System.out.println(list);
        Integer remove = list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(9));
        System.out.println(list);

        //for
        for (int i = 0; i < list.size(); i++) {
            System.out.print("" + list.get(i) + " ");
        }
        System.out.println();

        //foreach
        for(int value : list) {
            System.out.print("" + value +" ");
        }
        System.out.println();
    }
}
