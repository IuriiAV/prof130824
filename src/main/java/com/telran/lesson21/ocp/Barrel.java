package com.telran.lesson21.ocp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Barrel extends Shape {

    private double radius;

    private double height;

    @Override
    public double calculateVolume() {
        return radius * radius * Math.PI * height;
    }
}
