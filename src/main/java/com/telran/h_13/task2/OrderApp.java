package com.telran.h_13.task2;

public class OrderApp {

    public static void main(String[] args) {

        OrderManager orderManager = new OrderManager();
        String orderOne = "Pizza";
        String orderTwo = "Burger";
        String orderThree = "Pasta";

        orderManager.addOrder(orderOne);
        orderManager.addOrder(orderTwo);
        orderManager.addOrder(orderThree);

        System.out.println(orderManager.getOrders());

        orderManager.removeOrder("Pizza");

        System.out.println(orderManager.getOrders());

    }
}
