package com.telran.lesson8.custom;

public class CustomListApp {

    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();
        // 5 -> 10 -> 1 -> 4 -> 25 -> 7
        //get(index), addFirst(int data), addLast(), toString;

        //get(index), remove(index), add(index, data)
        //removeFirst(), removeLast(), size();

        //Add inerator, add second direction

        list.addFirst(7);
        list.addFirst(25);
        list.addFirst(4);
        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(5);

        list.addLast(43);
        list.print();


        // 5 -> 10 -> 1
//
//        Node three = new Node(1, null);
//        Node two = new Node(10, three);
//        Node one = new Node(5, two);
//
//        Node current = one;
//        while (current != null){
//            System.out.print(" " + current.getData() + "-> " );
//            current = current.getNext();
//        }

    }
}
