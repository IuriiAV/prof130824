package com.telran.lesson11.hw;

import java.util.Objects;

public class Patient {
    private String name;
    private int age;

    private boolean isUrgent;

    public Patient(String name, int age, boolean iUrgent) {
        this.name = name;
        this.age = age;
        this.isUrgent= iUrgent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean iUrgent) {
        this.isUrgent = iUrgent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age && isUrgent == patient.isUrgent && Objects.equals(name, patient.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isUrgent);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isUrgent=" + isUrgent +
                '}';
    }
}
