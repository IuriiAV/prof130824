package com.telran.myLesson21.openClosePrinciple;

public class VolumeCalculator {

    private double total = 0;

    public double getVolume(Shape shape) {
        total += shape.calculateVolume();
        return total;
    }
}
