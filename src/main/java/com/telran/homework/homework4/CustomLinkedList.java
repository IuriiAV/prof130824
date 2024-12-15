package com.telran.homework.homework4;

import java.util.Iterator;

public class CustomLinkedList  implements Iterable<Integer> {

    private Node head;

    //Time complexity O(1)
    public void addFirst(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }

        node.setNext(head);
        head = node;
    }

    //Time complexity O(n)
    public void addLast(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print("" + current.getData() + " -> ");
            current = current.getNext();
        }
    }

    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative!");
        }
        Node current = head;  // Начинаем с головы списка
        int count = 0;        // Инициализируем счётчик с 0

        while (current != null) {  // Пока текущий узел (current) не равен null
            if (count == index) {  // Если текущий индекс (count) равен запрашиваемому индексу (index)
                return current.getData();  // Возвращаем данные (data) текущего узла
            }
            current = current.getNext();
            // Переходим к следующему узлу (current = текущий узел, getNext = получить следующий)
            count++;  // Увеличиваем счётчик (count) на 1


        }
        throw new IndexOutOfBoundsException("Index out of bounds!");
    }

    public void remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative!");
            // Проверяем, что индекс не отрицательный
        }
        if (index == 0) {
            head = head.getNext();   // Переназначаем голову списка (head) на следующий узел (getNext)
            return;                  // Завершаем метод
        }
        Node current = head;  // Текущий узел, начинаем с головы (current = текущий, head = голова списка)

        int count = 0;  // Счётчик текущего индекса, начиная с 0

        while (current != null && count < index - 1) {
            current = current.getNext();
            // Переходим к следующему узлу (current = текущий узел, getNext = получить следующий)
            count++;  // Увеличиваем текущий индекс (count) на 1
        }
        if (current == null || current.getNext() == null) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
            // Если узел отсутствует, выбрасываем исключение
        }
        current.setNext(current.getNext().getNext());
        // Перепрыгиваем через следующий узел, чтобы удалить его (setNext = установить следующий)
    }

    public void add(int index, int data) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative!");
            // Проверяем, что индекс не отрицательный
        }
        if (index == 0) {
            head = new Node(data, head);
            // Создаём новый узел и делаем его головой списка (head). Новый узел указывает на текущий head.
            return;  // Завершаем метод
        }
        Node current = head;  // Текущий узел, начинаем с головы списка (current = текущий узел, head = голова списка)
        int count = 0;        // Счётчик текущего индекса, начиная с 0

        while (current != null && count < index - 1) {
            current = current.getNext();
            // Переходим к следующему узлу (current = текущий узел, getNext = получить следующий)
            count++;  // Увеличиваем текущий индекс (count) на 1
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
            // Если дошли до конца списка, выбрасываем исключение
        }
        Node newNode = new Node(data, current.getNext());
        // Создаём новый узел, который указывает на следующий узел после current
        current.setNext(newNode);
        // Устанавливаем ссылку текущего узла (current) на новый узел (newNode)
    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("Список пуст, нечего удалять.");
            // Если голова списка равна null, выводим сообщение
            return;  // Завершаем метод, так как список пуст
        }
        head = head.getNext();
        // Переназначаем голову списка (head) на следующий узел (getNext), чтобы удалить первый элемент
    }

    public void removeLast(){
        if (head == null) {
            System.out.println("Список пуст, нечего удалять.");
            // Если голова списка равна null, выводим сообщение
            return;  // Завершаем метод, так как список пуст
        }
        if (head.getNext() == null) {
            head = null;  // Устанавливаем head в null, чтобы удалить единственный элемент
            return;  // Завершаем метод
        }
        Node current = head;
        // Текущий узел, начинаем с головы списка (current = текущий, head = голова списка)

        while (current.getNext().getNext() != null) {
            current = current.getNext();
            // Переходим к следующему узлу (current = текущий узел, getNext = получить следующий)
        }
        current.setNext(null);
    }

    public int size(){
        int count = 0;  // Счётчик количества узлов, начинаем с 0

        Node current = head;
        // Текущий узел, начинаем с головы списка (current = текущий, head = голова списка)

        while (current != null) {
            count++;  // Увеличиваем счётчик узлов на 1
            current = current.getNext();
            // Переходим к следующему узлу (current = текущий узел, getNext = получить следующий)
        }
        return count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomLinkedListIterator(head);
    }
}



