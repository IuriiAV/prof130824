package com.telran.summarysix;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Person {

    private  String name;

    private String surname;

    private int id;

    private int rate;
}
