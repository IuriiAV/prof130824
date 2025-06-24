package com.telran.lesson26;

/**
 * @EventListener (status) - Status.CREATED, CANCELLED, PAID
 *
 * OrderStatusChangeEventHandler
 *      Помечены аннотацией со своим статусом
 *      onOrderCreated()
 *
 *      onOrderCancelled()
 *
 *      onOrderPaid()
 *
 * EventDispatcher
 *
 *      Map<Method,OrderStatusChangeEventHandler>
 *
 *      registerHandler(OrderStatusChangeEventHandler)
 *      должен пробежаться по всему хендлеру и собрать все методы
 *      помеченные аннотацией EventListener и положить их в кучку
 *
 *
 *      createEvent(Order) {
 *          взять статус заказа
 *          пройтись по кучке методов
 *          и выполнить те, которые подходят под статус
 *      }
 *
 * EventApp
 * EventDispatcher.register(EventHandler)
 * new Order
 * EventDispatcher.createEvent(order)
 *
 */
public class Task {
}
