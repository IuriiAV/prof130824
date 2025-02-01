package com.telran.lesson21.srp;

import lombok.Setter;

@Setter
public class Order {

    private Book book;

    private int quantity;

    private double discount;

    private double total;

    public Order() {
        //
    }

    private void calculateTotal() {
        total = quantity * book.getPrice() * discount;
    }

    public void addBook(Book book , int quantity) {
        this.book = book;
        this.quantity = quantity;
        calculateTotal();
    }

    //move to other classes
//    public void saveOrder() {
//        //connect to database
//        //db.save(this);
//    }
//
//    public void sendOrder() {
//        // send(this);
//    }
}
