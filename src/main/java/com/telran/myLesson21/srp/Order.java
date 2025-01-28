package com.telran.myLesson21.srp;

import lombok.Setter;

@Setter
public class Order {

    private Book book;

    private int quantity;

    private double discount;

    private double total;

    public Order() {
    }

    private void calculateTotal() {
        total = quantity * book.getPrice() * discount;
    }

    public void addBook(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
        calculateTotal();
    }

    //нарушение принципа single responsibility!!!!!
    private void saveOrder(){ // ----> moved to OrderStorage
        //connect to database
        //db.save(this);
    }
}
