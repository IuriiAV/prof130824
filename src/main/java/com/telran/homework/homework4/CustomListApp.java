package com.telran.homework.homework4;

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

        System.out.println("Элементы списка: ");
        for (int value : list){
            System.out.print(value + "> <");
        }
        System.out.println();
        System.out.println("---------------\n");


        // 5 -> 10- > 1-> 4-> 25 -> 7
        list.addLast(43);
        // 5 -> 10- > 1-> 4-> 25 -> 7 -> 43
        list.print();

        System.out.println();

        System.out.println("Элемент по индексу 0: " + list.get(0));
        System.out.println("Элемент по индексу 3: " + list.get(3));

        System.out.println("\n---------------");
        list.remove(3);
        list.print();
        list.add(3, 99);  // Добавляем число 99 на позицию с индексом 3
        System.out.println("\nСписок после добавления элемента:");
        list.print();     // Напечатаем список, чтобы убедиться, что элемент добавлен

        System.out.println("\n---------------");

        System.out.println("\nСписок перед удалением первого элемента: ");
        list.print();

        list.removeFirst();

        System.out.println("\nСписок после удаления первого элемента.");
        list.print();

        System.out.println("\n----------------");

        System.out.println("Список перед удалением последнего элемента.");
        list.print();

        list.removeLast();

        System.out.println("\nСписок после удаления последнего элемента.");
        list.print();

        System.out.println("\n-----------------");

        System.out.println("Текущий размер списка: " + list.size());

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