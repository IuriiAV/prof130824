package com.telran.summary1402.task;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventDispatcher {

    private Map<Method, OrderStatusChangeEventHandler> map = new HashMap<>();

    public void registerHandler(OrderStatusChangeEventHandler handler) {
        Method[] methods = handler.getClass().getMethods(); // Получаем методы класса обработчика

        for (Method method : methods) {
            if (method.isAnnotationPresent(EventListener.class)) {
                map.put(method, handler); // Сохраняем методы с аннотацией
            }
        }
    }

    public void createEvent(Order order) {
        Status status = order.getStatus(); // Получаем статус заказа
        map.forEach((method, handler) -> {
            EventListener annotation = method.getAnnotation(EventListener.class);
            if (annotation.status() == status) { // Проверяем соответствие статуса
                try {
                    method.invoke(handler); // Вызываем метод
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
