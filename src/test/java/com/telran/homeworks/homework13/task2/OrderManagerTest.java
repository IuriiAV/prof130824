package com.telran.homeworks.homework13.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {
    @ParameterizedTest
    @MethodSource("provideOrdersForAdd")
    void testAddOrder(String order, List<String> expectedOrders) {
        OrderManager manager = new OrderManager();
        manager.addOrder(order);
        assertEquals(expectedOrders, manager.getOrders());
    }

    private static Stream<Arguments> provideOrdersForAdd() {
        return Stream.of(
                Arguments.of("Order1", List.of("Order1")),
                Arguments.of("Order2", List.of("Order2")),
                Arguments.of("Special Order", List.of("Special Order"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideOrdersForRemove")
    void testRemoveOrder(List<String> initialOrders, String orderToRemove, List<String> expectedOrders) {
        OrderManager manager = new OrderManager();
        initialOrders.forEach(manager::addOrder);
        manager.removeOrder(orderToRemove);
        assertEquals(expectedOrders, manager.getOrders());
    }

    private static Stream<Arguments> provideOrdersForRemove() {
        return Stream.of(
                Arguments.of(List.of("Order1", "Order2"), "Order1", List.of("Order2")),
                Arguments.of(List.of("Order1", "Order2", "Order3"), "Order2", List.of("Order1", "Order3")),
                Arguments.of(List.of("Order1"), "Order1", List.of())
        );
    }

    @Test
    void testRemoveNonExistentOrderThrowsException() {
        OrderManager manager = new OrderManager();
        manager.addOrder("Order1");
        assertThrows(NoSuchElementException.class, () -> manager.removeOrder("NonExistentOrder"));
    }


    @ParameterizedTest
    @NullAndEmptySource
    void testAddNullOrEmptyOrderThrowsException(String invalidOrder) {
        OrderManager manager = new OrderManager();
        assertThrows(IllegalArgumentException.class, () -> manager.addOrder(invalidOrder));
    }

}