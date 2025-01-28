package com.telran.myLesson21.openClosePrinciple;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Barrel extends Shape {

    private double radius;

    private double height;

    @Override
    public double calculateVolume() {
        return radius * radius * height;
    }
}
