package com.telran.summary140225.task;

public class OrderStatusChangeEventHandler {

    @EventListener(status = Status.CREATED)
    public void onOrderCreated(){
        System.out.println("the Order is created");
    }
    @EventListener( status = Status.CANCELLED)
    public void onOrderCanceled(){
        System.out.println("the Order is cancelled");
    }
    @EventListener( status = Status.PAID)
    public void onOrderPaid(){
        System.out.println("the Order is paid");
    }
}
