package com.telran.lesson21.ocp;

public class DockerApp {

    public static void main(String[] args) {
        Cube cubeOne = new Cube(0.5,0.2,0.1);
        Cube cubeTwo = new Cube(0.5,0.2,0.1);

        VolumeCalculator volumeCalculator = new VolumeCalculator();
        double volume = volumeCalculator.getVolume(cubeOne);
        System.out.println("Volume with one " + volume);
        volume = volumeCalculator.getVolume(cubeTwo);
        System.out.println("Volume with one + two " + volume);

        Barrel barrel = new Barrel(0.2, 4);
        volume = volumeCalculator.getVolume(barrel);
        System.out.println("Volume with one + two + barrel " + volume);

    }
}
