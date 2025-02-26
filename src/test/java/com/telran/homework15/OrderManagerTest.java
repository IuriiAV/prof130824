package com.telran.homework15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderManagerTest {

    private OrderManager orderManager;

    @BeforeEach
    public void init() {
        orderManager = new OrderManager();
    }

    @Test
    public void testAddOrder() {
        orderManager.addOrder("Sunglasses");
        assertEquals(List.of("Sunglasses"), orderManager.getOrders());
    }

    @ParameterizedTest
    @MethodSource("dataForAddingItemsIntoList")
    public void testAddSeveralOrders(String orderOne, String orderTwo, List<String> orderList) {
        orderManager.addOrder(orderOne);
        orderManager.addOrder(orderTwo);
        assertEquals(orderList, orderManager.getOrders());

    }

    private Stream<Arguments> dataForAddingItemsIntoList() {
        return Stream.of(
                Arguments.of("T-shirt", "Dress", List.of("T-shirt", "Dress")),
                Arguments.of("T-shirt", "T-shirt", List.of("T-shirt", "T-shirt"))
        );
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testAddNullOrEmptyOrder(String order) {
        assertThrows(IllegalArgumentException.class, () -> orderManager.addOrder(order));
    }

    @Test
    public void testRemoveOrder() {
        orderManager.addOrder("T-shirt");
        orderManager.addOrder("Dress");
        assertEquals(List.of("T-shirt", "Dress"), orderManager.getOrders());
        orderManager.removeOrder("T-shirt");
        assertEquals(List.of("Dress"), orderManager.getOrders());
    }

    @Test
    public void testRemoveTheOnlyOrder() {
        orderManager.addOrder("T-shirt");
        assertEquals(List.of("T-shirt"), orderManager.getOrders());
        orderManager.removeOrder("T-shirt");
        assertTrue(orderManager.getOrders().isEmpty());
    }

    @ParameterizedTest
    @MethodSource("dataForDeletingInvalidOrder")
    public void testDeleteNonExistentOrder(String order, Class<? extends Throwable> exception) {
        orderManager.addOrder("T-shirt");
        assertThrows(exception, () -> orderManager.removeOrder(order));
    }

    private Stream<Arguments> dataForDeletingInvalidOrder() {
        return Stream.of(
                Arguments.of(null, IllegalArgumentException.class),
                Arguments.of("", IllegalArgumentException.class),
                Arguments.of("NotExist", NoSuchElementException.class)
        );
    }
}