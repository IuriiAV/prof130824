package com.telran.homework.homework15.task2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Getter
public class OrderManager {

    List<String> orders = new ArrayList<>();

    public void addOrder(String order) {
        if (order == null || order.isEmpty()) {
            throw new IllegalArgumentException("Order cannot be null or empty");
        }
        orders.add(order);
    }

    public void removeOrder(String order) {
        if (orders.isEmpty()) {
            throw new NoSuchElementException("Order list is empty");
        }
        if (order == null || order.isEmpty()) {
            throw new IllegalArgumentException("Order cannot be null or empty");
        }
        boolean isRemoved = orders.remove(order);
        if (!isRemoved) {
            throw new NoSuchElementException("Order not found");
        }
    }

}

//Создайте класс OrderManager, который управляет списком заказов (List). Реализуйте методы:
//
//
//addOrder(String order) – добавляет заказ в список. Если order == null или пустая строка, выбрасывает IllegalArgumentException.
//removeOrder(String order) – удаляет заказ. Если заказа нет, выбрасывает NoSuchElementException.
//getOrders() – возвращает список всех заказов.
//
//JUnit-тесты:
//
//
//Проверить добавление заказа.
//Проверить удаление заказа.
//Проверить выброс исключения при попытке удалить несуществующий заказ.
//Проверить выброс исключения при добавлении null или пустой строки.
//Использовать параметризованные тесты для разных сценариев.