package com.telran.lesson8.custom;

public class CustomListApp {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        // 5 -> 10- > 1-> 4-> 25 -> 7
        // head : 5
        // get(index), addFirst(int data), addLast(), toString

        //* Add iterator, add second direction

        list.addFirst(7);
        list.addFirst(25);
        list.addFirst(4);
        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(5);
        // 5 -> 10- > 1-> 4-> 25 -> 7
        list.addLast(43);
        // 5 -> 10- > 1-> 4-> 25 -> 7 -> 43
        list.add(7, 99);
        System.out.println("Size = " + list.size());
        list.print();
        list.removeFirst();
        list.removeLast();
        System.out.println();
        list.print();

        System.out.println();
        System.out.println(list.remove(4));
        System.out.println("Size = " + list.size());
        list.print();
    }
}
