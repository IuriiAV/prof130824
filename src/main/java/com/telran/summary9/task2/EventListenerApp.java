package com.telran.summary9.task2;

import java.util.Date;

/**
 *
 */
public class EventListenerApp {

    public static void main(String[] args) {

        EventDispatcher eventDispatcher = new EventDispatcher();
        OrderStatusChangeEventHandler handler = new OrderStatusChangeEventHandler();
        Order order = new Order(new Date(), 11, Status.CREATE);

        eventDispatcher.registerHandler(handler);
        eventDispatcher.createEvent(order);

        order.setStatus(Status.PAID);
        eventDispatcher.createEvent(order);

    }
}
