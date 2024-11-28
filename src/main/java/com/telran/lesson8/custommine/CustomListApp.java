package com.telran.lesson8.custommine;

import java.util.Iterator;

public class CustomListApp {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        // 5 -> 10- > 1-> 4-> 25 -> 7
        // head : 5
        // get(index), addFirst(int data), addLast(), toString

        //to HW : get(index) , remove(index), add(index, data)
        //removeFirst(), removeLast() , size()
        //* Add iterator, add second direction

        list.addFirst(7);
        list.addFirst(25);
        list.addFirst(4);
        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(5);
        // 5 -> 10- > 1-> 4-> 25 -> 7

        list.print();

        list.addLast(43);

        System.out.println("\nAfter adding to the end:");

        list.print();

        System.out.println("\nElement at index 2: " + list.get(2));

        list.print();

        list.remove(3);
        System.out.println("\nAfter removing element at index 3:");
        list.print();


        list.addIndex(3, 99);
        System.out.println("\nAfter adding 99 at index 3:");
        list.print();

        list.removeFirst();
        System.out.println("\nAfter removing the first element:");
        list.print();

        list.removeLast();
        System.out.println("\nAfter removing the last element:");
        list.print();


        System.out.println("\nSize of the list: " + list.size());

        list.print();


        System.out.println("Initial list:");
        list.print();

        System.out.println("\n\nUsing iterator:");
        for (int value : list) {
            System.out.print(value + " ");
        }

        list.reverse();
        System.out.println("\n\nList after reversing:");
        list.print();
    }

}

// 5 -> 10- > 1-> 4-> 25 -> 7 -> 43



//        // 5 -> 10 -> 1 -> null
//        Node three = new Node(1, null);
//        Node two = new Node(10, three);
//        Node one = new Node(5, two);

//        Node one = new Node(5, null);
//        Node two = new Node(10, null);
//        Node three = new Node(1, null);
//        one.setNext(two);
//        two.setNext(three);

//        Node current = one;
//        while (current != null) {
//            System.out.print("" + current.getData() + "->");
//            current = current.getNext();
//        }





