package com.telran.myLesson21.openClosePrinciple;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cube extends Shape {

    private double length;

    private double width;

    private double height;

    @Override
    public double calculateVolume() {
        return length * width * height;
    }
}
