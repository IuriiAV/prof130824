package com.telran.homeworks.homework13.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Создайте класс OrderManager, который управляет списком заказов (List). Реализуйте методы:
 *
 *
 * addOrder(String order) – добавляет заказ в список. Если order == null или пустая строка, выбрасывает IllegalArgumentException.
 * removeOrder(String order) – удаляет заказ. Если заказа нет, выбрасывает NoSuchElementException.
 * getOrders() – возвращает список всех заказов.
 *
 * JUnit-тесты:
 *
 *
 * Проверить добавление заказа.
 * Проверить удаление заказа.
 * Проверить выброс исключения при попытке удалить несуществующий заказ.
 * Проверить выброс исключения при добавлении null или пустой строки.
 * Использовать параметризованные тесты для разных сценариев.
 */
public class OrderManager {
    private final List<String> orders;


    public OrderManager() {
        this.orders = new ArrayList<>();
    }


    public void addOrder(String order) {
        if (order == null || order.trim().isEmpty()) {
            throw new IllegalArgumentException("Order cannot be null or empty");
        }
        orders.add(order);
    }


    public void removeOrder(String order) {
        if (!orders.contains(order)) {
            throw new NoSuchElementException("Order not found: " + order);
        }
        orders.remove(order);
    }


    public List<String> getOrders() {
        return new ArrayList<>(orders);
    }
}

