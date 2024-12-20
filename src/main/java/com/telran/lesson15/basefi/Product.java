package com.telran.lesson15.basefi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Product {

    private String title;

    private double price;

    private boolean inStock;
}
