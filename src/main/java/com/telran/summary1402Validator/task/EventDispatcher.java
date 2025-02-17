package com.telran.summary1402Validator.task;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventDispatcher {

    private Map<Method, OrderStatusChangeEventHandler> map = new HashMap<>();

    public void registerHandler(OrderStatusChangeEventHandler handler) {
        Class<? extends OrderStatusChangeEventHandler> clazz = handler.getClass();
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(EventListener.class)) {
                map.put(method, handler);
            }
        }
    }

    public void createEvent(Order order) {
        Status status = order.getStatus();
        map.forEach((method, handler) -> {
            EventListener annotation = method.getAnnotation(EventListener.class);
            if (annotation.status() == status) {
                try {
                    method.invoke(handler);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
