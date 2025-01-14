package com.telran.lesson17StreamApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Person {

    private Long id;

    private String name;

    private String surname;
}
