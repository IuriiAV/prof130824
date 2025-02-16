package com.telran.summary1402.task;

public class OrderStatusChangeEventHandler {

    @EventListener(status = Status.CREATED) // Статус создан
    public void onOrderCreated() {
        System.out.println("Order has been created!");
    }

    @EventListener(status = Status.CANCELLED) // Статус отменён
    public void onOrderCanceled() {
        System.out.println("Order has been canceled!");
    }

    @EventListener(status = Status.PAID) // Статус оплачен
    public void onOrderPaid() {
        System.out.println("Order has been paid!");
    }
}
