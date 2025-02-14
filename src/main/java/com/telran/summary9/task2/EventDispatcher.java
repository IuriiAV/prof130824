package com.telran.summary9.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventDispatcher {

    private Map<Method,OrderStatusChangeEventHandler> listMethod = new HashMap<>();

    public void registerHandler(OrderStatusChangeEventHandler handler) {
        Class<? extends OrderStatusChangeEventHandler> clszz = handler.getClass();
        Method[] declaredMethods = clszz.getDeclaredMethods();
        for (Method method: declaredMethods){
            if (method.isAnnotationPresent(EventListener.class)){
                listMethod.put(method,handler);
            }
        }
    }

    public void createEvent(Order order) {
        Status status = order.getStatus();
        listMethod.forEach((method,handler) -> {
            EventListener annotation = method.getAnnotation(EventListener.class);
            if (annotation.orderStatus().equals(status)){
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
