package com.telran.summary9.task2;

public class OrderStatusChangeEventHandler {

    @EventListener(orderStatus = Status.CREATE)
    public void onOrderCreated(){
        System.out.println("is create");
    }

    @EventListener(orderStatus = Status.CANCELLED)
    public void onOrderCanceled(){
        System.out.println("is cancelled");
    }

    @EventListener(orderStatus = Status.PAID)
    public void onOrderPaid(){
        System.out.println("is paid");
    }
}
