package com.telran.homework.homework4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedListIterator implements Iterator<Integer> {

    private Node current;

    // Конструктор итератора, принимающий ссылку на голову списка
    public CustomLinkedListIterator(Node head){
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        // Проверяем, есть ли следующий элемент (если текущий не null)
        return current != null;
    }

    @Override
    public Integer next() {
        if (current == null){
            throw new NoSuchElementException();
        }
        // Получаем данные из текущего узла
        int data = current.getData();
        // Переходим к следующему узлу
        current = current.getNext();
        return data;
    }
}
