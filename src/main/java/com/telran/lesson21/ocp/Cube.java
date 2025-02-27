package com.telran.lesson21.ocp;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor

@Data

public class Cube extends Shape{

    private double length;

    private double width;

    private double height;

    @Override
    public double calculateVolume() {
       return height * width * length;
    }
}
