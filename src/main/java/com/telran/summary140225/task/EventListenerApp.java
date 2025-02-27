package com.telran.summary140225.task;

import java.util.Date;

/**
 * Event - отслеживать изменения объекта(статус заказа)
 * Дата, номер, статус - Enum
 * Status - Created, Cancelled,Paid
 * setter for OrderStatus
 * Annotation - EventListener у нее параметр - StatusOrder
 * Class EventHandler - methods - которые отвечают за обработку заказов с помощью аннотации
 * Class EventDispatcher: register(EventHandler eh), createEvent(Status status)
 *
 * @EventListener (status) - Status.CREATED, CANCELLED, PAID
 *
 * OrderStatusChangeEventHandler
 *   Помечены аннотацией со своим статусом
 *    onOrderCreated()
 *
 *    onOrderCancelled()
 *
 *    onOrderPaid()
 *
 *    EventDispatcher
 *
 *    Map<Method,OrderStatusChangeEventHandler>
 *
 *         registerHandler(OrderStatusChangeEventHandler)
 *         должен пробежаться по всему хендлеру и собрать все методы помеченные аннотацией EventListener и положить их в кучку
 *
 *         createEvent(Order) {
 *             взять статус заказа
 *             пройтись по кучке методов
 *             и выполнить те, которые подходят под статус
 *         }
 *      EventApp
 *      EventDispatcher.register(EventHandler)
 *
 *      new Order
 *         EventDispatcher.createEvent(order)
 */
public class EventListenerApp {

    public static void main(String[] args) {
        EventDispatcher eventDispatcher = new EventDispatcher();
        OrderStatusChangeEventHandler handler = new OrderStatusChangeEventHandler();
        Order order = new Order(new Date(), 11, Status.CREATED);

        eventDispatcher.registerHandler(handler);
        eventDispatcher.createEvent(order);

        order.setStatus(Status.PAID);
        eventDispatcher.createEvent(order);
    }

}