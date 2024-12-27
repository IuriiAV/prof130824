package com.telran.summarryfour;

import lombok.EqualsAndHashCode;



@EqualsAndHashCode
public class Student {

    private String name;

    private String surname;

    @EqualsAndHashCode.Exclude
    private  int age;


}
