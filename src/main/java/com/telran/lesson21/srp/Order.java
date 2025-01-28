package com.telran.lesson21.srp;

import lombok.Setter;

@Setter
public class Order {

    private  int quantity;

    private Book book;

    private double discount;

    private double total;

    public Order(){
       //
    }

    private void calculateTotal(){
        total = quantity * book.getPrice() * discount;
    }

    public void  addBook(Book book, int quantity){
        this.book = book;
        this.quantity = quantity;
        calculateTotal();
    }

    private void saveOrder(){
        //connect to database
        // db.save(this);
    }
}
