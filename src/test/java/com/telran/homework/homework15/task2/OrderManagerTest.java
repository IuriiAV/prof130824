package com.telran.homework.homework15.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    private final static List<String> listForRemoveTests = Arrays.asList("Order One", "Order Two", "Order Three", "Order Four");

    @ParameterizedTest
    @NullAndEmptySource
    void testAddOrderWhenArgumentIsNullOrEmpty(String string) {
        OrderManager orderManager = new OrderManager();
        assertThrows(IllegalArgumentException.class, () -> orderManager.addOrder(string));
    }

    @ParameterizedTest
    @MethodSource(value = "provideStringListForAddOrder")
    void testAddOrderWhenOrderIsValid(String string) {
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(string);
        boolean b = orderManager.getOrders().contains(string);
        assertTrue(b);
    }

    static Stream<String> provideStringListForAddOrder() {
        return Stream.of("Some", "Test", "A", "a");
    }

    @Test
    void testRemoveOrderWhenOrderListIsEmpty() {
        OrderManager orderManager = new OrderManager();
        assertThrows(NoSuchElementException.class, () -> orderManager.removeOrder("Some"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testRemoveOrderWhenArgumentIsNullOrEmpty(String string) {
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder("Some Order");
        assertThrows(IllegalArgumentException.class, () -> orderManager.removeOrder(string));
    }

    @ParameterizedTest
    @MethodSource(value = "provideStringListForRemoveTest")
    void testRemoveOrderWhenArgumentIsValid(String string) {
        OrderManager orderManager = new OrderManager();
        listForRemoveTests.forEach(orderManager::addOrder);
        assertTrue(orderManager.getOrders().contains(string));
        orderManager.removeOrder(string);
        boolean contains = orderManager.getOrders().contains(string);
        assertFalse(contains);
    }

    @ParameterizedTest
    @MethodSource(value = "provideStringListForRemoveTest")
    void testRemoveOrderWhenArgumentIsInvalid(String string) {
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder("Some Order");
        assertThrows(NoSuchElementException.class, () -> orderManager.removeOrder(string));
    }

    static Stream<String> provideStringListForRemoveTest() {
        return listForRemoveTests.stream();
    }
}