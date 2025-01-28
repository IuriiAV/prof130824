package com.telran.myLesson21.openClosePrinciple;

public class DockerApp {

    public static void main(String[] args) {
        Cube cubeOne = new Cube(0.5, 0.2, 0.1);
        Cube cubeTwo = new Cube(0.3, 0.1, 0.2);

        VolumeCalculator volumeCalculator = new VolumeCalculator();
        double volume = volumeCalculator.getVolume(cubeOne);
        System.out.println("for the first cube " + volume);
        volume = volumeCalculator.getVolume(cubeTwo);
        System.out.println("sum of volumes of the two cubes: " + volume);
    }
}
