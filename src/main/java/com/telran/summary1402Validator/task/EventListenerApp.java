package com.telran.summary1402Validator.task;

import java.util.Date;

/**
 * Class Event : отслеживать изменеие объекта Order status : date, number, status(Enam: created, cancelled, paid)
 * setter for OderStatus
 *
 * @ EventListener : orderStatus
 * <p>
 * Class EventHandler : methods with @ for order processing
 * <p>
 * Class EventDispatcher : register(EventHandler eh), createEvent(Status status)
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
