package com.telran.summary9.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Order {

    private Date data;

    private int number;

    private Status status;

}
