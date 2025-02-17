package com.telran.h_13.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    private static final OrderManager orderManager = new OrderManager();

    @BeforeAll
    public static void init(){
        String orderOne = "Pasta";
        orderManager.addOrder(orderOne);
    }
    @Test
    public void testAddOrder() {
        orderManager.addOrder("Pizza");
        assertEquals("Pizza", orderManager.getOrders().get(1));
    }

    @Test
    public void testRemoveOrder() {
        orderManager.addOrder("Pizza");
        orderManager.removeOrder("Pizza");
        assertEquals("Pasta", orderManager.getOrders().get(0));
    }

    @Test
    public void testRemoveOrderException() {
        assertThrows(NoSuchElementException.class, () -> orderManager.removeOrder("Burger"));
    }

    @ParameterizedTest
    @MethodSource(value = "genDataException")
    public void testNullOrderOrIsEmpty(String order) {
        assertThrows(IllegalArgumentException.class, () -> orderManager.addOrder(order));

    }

    public static Stream<Arguments> genDataException() {
        Arguments nullExcept = Arguments.of(null, IllegalArgumentException.class);
        Arguments emptyExcept = Arguments.of("", IllegalArgumentException.class);
        return Stream.of(nullExcept, emptyExcept);
    }

}