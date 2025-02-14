package com.telran.summary140225.task;

import java.util.Date;

public class Order {

    private Date date;

    private int number;

    private  Status status;

    public Order(Date date, int i, Status created) {
        this.date = this.date;
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
