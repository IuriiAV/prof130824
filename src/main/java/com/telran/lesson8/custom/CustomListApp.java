package com.telran.lesson8.custom;

public class CustomListApp {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        // 5 -> 10- > 1-> 4-> 25 -> 7
        // head : 5
        // get(index), addFirst(int data), addLast(), toString

        //to HW : get(index) , remove(index), add(index, data)
        //removeFirst(), removeLast() , size()
        //* Add iterator, add second direction
        System.out.println("First size: " + list.size());
        list.addFirst(7);

        System.out.println("size should be 1: " + list.size());

        list.addFirst(25);
        list.addFirst(4);
        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(5);
        // 5 -> 10- > 1-> 4-> 25 -> 7
        list.addLast(43);
        // 5 -> 10- > 1-> 4-> 25 -> 7 -> 43
        System.out.println("Size should be 7: " + list.size());
        list.print();

        System.out.println();

        System.out.println("Get value by index = 3 is " + list.get(3));

        System.out.println("Delete element by index 2: " + list.get(2));
        list.remove(2);
        System.out.println("Size should be 6: " + list.size());
        list.print();

        System.out.println("\nDelete element by index 0: " + list.get(0));
        list.remove(0);
        System.out.println("Size should be 5: " + list.size());
        list.print();

        System.out.println("\nAdd element by index 1 with value = 101: ");
        list.add(1, 101);
        System.out.println("Size should be 6: " + list.size());
        list.print();

        System.out.println("\nAdd element by index 0 with value = 100: ");
        list.add(0, 100);
        System.out.println("Size should be 7: " + list.size());
        list.print();

        System.out.println("\nAdd element by index 6 with value = 106: ");
        list.add(6, 106);
        System.out.println("Size should be 8: " + list.size());
        list.print();

        System.out.println("\nAdd element by index 8 with value = 108: ");
        list.add(8, 108);
        System.out.println("Size should be 9: " + list.size());
        list.print();

        System.out.println("\nFirst " + list.get(0) + " is deleted");
        list.removeFirst();
        System.out.println("Size should be 8: " + list.size());
        list.print();

        System.out.println("\nRemove last with value: " );
        list.removeLast();
        System.out.println("Size should be 7: " + list.size());
        list.print();

        System.out.println("\nThe size is " + list.size());

        System.out.println("-------------------------------");
        CustomLinkedList list1 = new CustomLinkedList();
        list1.add(0,505);
        list1.add(15,506);
        list1.add(15,507);
        list1.print();
        System.out.println();
        list1.removeFirst();
        list1.print();
        System.out.println(list1.get(16));

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
