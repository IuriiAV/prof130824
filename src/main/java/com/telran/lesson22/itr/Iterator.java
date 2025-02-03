package com.telran.lesson22.itr;


/**
 * Итератор - поведенческий паттерн, который позволяет перебирать элементы коллекции без дополнительной
 * детализации о коллекции и как она работает
 * @param <T>
 */
public interface Iterator <T>{

    boolean hasNext();

    T next();
}
