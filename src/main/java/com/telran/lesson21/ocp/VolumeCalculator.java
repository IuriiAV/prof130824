package com.telran.lesson21.ocp;

public class VolumeCalculator {

    private double totalVolume;

    public double getVolume(Shape shape) {
        totalVolume += shape.calculateVolume();
//        if (shape instanceof Cube) {
//            Cube cube = (Cube) shape;
//            totalVolume += cube.getHeight() * cube.getLength() * cube.getWidth();
//        } else {
//            Barrel barrel = (Barrel) shape;
//            totalVolume += barrel.getRadius() * barrel.getRadius()*Math.PI * barrel.getHeight();
//
//        }
        return totalVolume;
    }
}