package com.telran.h_13.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OrderManager {

    List<String> list = new ArrayList<>();

    public void addOrder(String order){
        if (order == null || order.isEmpty()){
            throw new IllegalArgumentException("order is null or oder is empty");
        }
        list.add(order);
    } // – добавляет заказ в список. Если order == null или пустая строка, выбрасывает IllegalArgumentException.

    public void removeOrder(String order){
        if (!list.contains(order)){
            throw new NoSuchElementException("order is not in order list");
        }
        list.remove(order);
    } //– удаляет заказ. Если заказа нет, выбрасывает NoSuchElementException.

    public List<String> getOrders(){
        return list;
    }// – возвращает список всех заказов.

}
