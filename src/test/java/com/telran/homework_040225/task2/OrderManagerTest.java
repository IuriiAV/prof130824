package com.telran.homework_040225.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    @ParameterizedTest
    @ValueSource(strings = {"Order1", "Order2", "TestOrder"})
    void addOrder(String order) {
        OrderManager manager = new OrderManager();
        manager.addOrder(order);
        assertTrue(manager.getOrders().contains(order));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Order1", "Order2", "TestOrder"})
    void removeOrder(String order) {
        OrderManager manager = new OrderManager(List.of(order));
        manager.removeOrder(order);
        assertFalse(manager.getOrders().contains(order));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    void addInvalidOrder(String order) {
        OrderManager manager = new OrderManager();
        assertThrows(IllegalArgumentException.class, () -> manager.addOrder(order));
    }

    @Test
    void addNullOrder() {
        OrderManager manager = new OrderManager();
        assertThrows(IllegalArgumentException.class, () -> manager.addOrder(null));
    }

    @Test
    void removeNonExistentOrder() {
        OrderManager manager = new OrderManager(List.of("Order1", "Order2"));
        assertThrows(NoSuchElementException.class, () -> manager.removeOrder("Order3"));
    }
}
