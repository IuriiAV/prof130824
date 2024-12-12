package com.telran.lesson11.hw;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Patient implements Comparable<Patient>{

    @Getter
    private String lastName;

    @Getter
    private String name;

    private Priority priority;

    public Patient(String name, String lastName, Priority priority) {
        this.name = name;
        this.lastName = lastName;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient o) {
        int priorityResult = this.priority.getValue() - o.priority.getValue();
        if (priorityResult == 0) {
            int lastNameResult = this.lastName.compareTo(o.getLastName());
            if (lastNameResult == 0) {
                return this.name.compareTo(o.getName());
            }
            return lastNameResult;
        }
        return priorityResult;
    }
}
