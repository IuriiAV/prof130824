package com.telran.summary1402.task;

import java.util.Date;

public class Order {
    private Date date;
    private int number;
    private Status status;

    public Order(Date date, int number, Status status) {
        this.date = date;
        this.number = number;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
