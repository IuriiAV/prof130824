package com.telran.homework.homework5;

import lombok.Getter;
import lombok.Setter;

public class Patient {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int age;

    private boolean isUrgent;

    public Patient(String name, int age, boolean isUrgent) {
        this.name = name;
        this.age = Integer.parseInt(String.valueOf(age));
        this.isUrgent = isUrgent;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }
}
