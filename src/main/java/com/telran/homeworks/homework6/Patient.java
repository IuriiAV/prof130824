package com.telran.homeworks.homework6;

public class Patient {
    private String name;
    private int arrivalOrder;
    private boolean isUrgent;

    public Patient(String name, int arrivalOrder, boolean isUrgent) {
        this.name = name;
        this.arrivalOrder = arrivalOrder;
        this.isUrgent = isUrgent;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public int getArrivalOrder() {
        return arrivalOrder;
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', urgent=" + isUrgent + ", arrivalOrder=" + arrivalOrder + "}";
    }
}

