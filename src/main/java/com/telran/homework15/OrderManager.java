package com.telran.homework15;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OrderManager {

    private final List<String> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(String order) {
        if (order == null || order.isEmpty()) {
            throw new IllegalArgumentException("The order is null or empty");
        }
        orders.add(order);
    }

    public void removeOrder(String order) {
        if (order == null || order.isEmpty()) {
            throw new IllegalArgumentException("The order is null or empty");
        }
        if (!orders.contains(order)) {
            throw new NoSuchElementException("The requested for deleting order doesn't exist");
        }
        orders.removeIf(o -> o.equals(order));
    }

    public List<String> getOrders() {
        return orders;
    }
}
