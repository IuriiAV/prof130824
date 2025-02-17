package com.telran.homework5.custom;

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
        System.out.println(list.size());
        // 5 -> 10- > 1-> 4-> 25 -> 7
//        list.addLast(43);
        // 5 -> 10- > 1-> 4-> 25 -> 7 -> 43
//        list.print();



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
    }

}

