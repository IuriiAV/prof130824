package com.telran.summary1402Validator.task;

public class OrderStatusChangeEventHandler {

    @EventListener(status = Status.CREATED)
    public void onOrderCreated() {
        System.out.println("the order is created");
    }

    @EventListener(status = Status.CANCELLED)
    public void onOrderCancelled() {
        System.out.println("the order is cancelled");
    }

    @EventListener(status = Status.PAID)
    public void onOrderPaid() {
        System.out.println("the order is paid");
    }
}
