package com.telran.h5.custom;

import java.util.Iterator;

/**
 * get(index), remove(index), add(index, data)
 * removeFirst(), removeLast(), size();
 * Add iterator, add secondDirection
 */
public class CustomListApp {

    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();

        list.addFirst(7);
        list.addFirst(25);
        list.addFirst(4);
        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(5);

        list.addLast(43);
        list.print();
        System.out.println(list);

        int element = list.get(4);
        System.out.println(element);

        System.out.println("The size is = " + list.size());

        list.removeFirst();
        list.print();

        list.removeLast();
        list.print();

        list.remove(4);
        list.print();

        list.addIndex(2,31);
        list.print();
//
//        Iterator<Node> iterator = list.iterator();
//
//       while (iterator.hasNext()){
//           System.out.println(iterator.next());
//        }



    }


}
