package com.telran.summary1402.task;

/**
 * Event : отслеживать изменение объекта Order status: date ,number,status (Enum : created,canceled,paid)
 * setter for OrderStatus
 *
 * @ EventListener : orderStatus
 *
 * Class EventHandler : methods with@ for order processing
 *
 * Class EventDispatcher : register(EventHandler eh), createEvent(Status status)
 *
 */

import java.util.Date;

/**
 * * @EventListener (status) - Status.CREATED, CANCELLED, PAID
 * *
 * * OrderStatusChangeEventHandler
 * *      Помечены аннотацией со своим статусом
 * *      onOrderCreated()
 * *
 * *      onOrderCancelled()
 * *
 * *      onOrderPaid()
 * *
 * * EventDispatcher
 * *
 * *      Map<Method,OrderStatusChangeEventHandler>
 * *
 * *      registerHandler(OrderStatusChangeEventHandler)
 * *      должен пробежаться по всему хендлеру и собрать все методы
 * *      помеченные аннотацией EventListener и положить их в кучку
 * *
 * *
 * *      createEvent(Order) {
 * *          взять статус заказа
 * *          пройтись по кучке методов
 * *          и выполнить те, которые подходят под статус
 * *      }
 * * EventApp
 * * EventDispatcher.register(EventHandler)
 * * new Order
 * * EventDispatcher.createEvent(order)
 * *
 */
public class EventListenerApp {

    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher(); // Создаём диспетчер событий
        OrderStatusChangeEventHandler handler = new OrderStatusChangeEventHandler(); // Создаём обработчик

        dispatcher.registerHandler(handler); // Регистрируем обработчик

        // Создаём заказ со статусом CREATED
        Order order = new Order(new Date(), 11, Status.CREATED);
        dispatcher.createEvent(order); // Генерируем событие

        // Создаём заказ со статусом CANCELLED
        order.setStatus(Status.CANCELLED);
        dispatcher.createEvent(order); // Генерируем событие

        // Создаём заказ со статусом PAID
        order.setStatus(Status.PAID);
        dispatcher.createEvent(order); // Генерируем событие
    }
}

