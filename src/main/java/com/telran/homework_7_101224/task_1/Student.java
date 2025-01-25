package com.telran.homework_7_101224.task_1;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Student {

    private final String id;
    @Setter
    private String firstName;
    @Setter
    private String lastName;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
