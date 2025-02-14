package com.telran.summary1402Validator.task;

import java.util.Date;

public class Order {
    //date, number, status
    private Date date;

    private int number;

    private Status status;

    public Order(Date date, int number, Status status) {
        this.date = date;
        this.number = number;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
