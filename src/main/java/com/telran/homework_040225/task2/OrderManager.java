package com.telran.homework_040225.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OrderManager {
    private List<String>orders;

    public OrderManager() {
        this.orders=new ArrayList<>();
    }

    public OrderManager(List<String> orders) {
        this.orders = new ArrayList<>(orders);
    }


    public void addOrder(String order) {
        if (order == null || order.trim().isEmpty()) {
            throw new IllegalArgumentException("Order cannot be null or empty");
        }
        orders.add(order);
    }

    public void removeOrder(String order) {
        if (!orders.contains(order)) {
            throw new NoSuchElementException("Order not found");
        }
        orders.remove(order);
    }

    public List<String> getOrders() {
        return new ArrayList<>(orders);
    }
}
