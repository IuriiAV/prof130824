package com.telran.lesson21.lsp;

public class VehicleApp {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        drive(vehicle);

        Car car = new Car();
        drive(car);

        Bicycle bicycle = new Bicycle();
        drive(bicycle);
    }

    public static void drive(Vehicle vehicle) {
        vehicle.drive();
    }

    public static void driveWithEngine(Motorized motorized) {
        motorized.startEngine();
        motorized.drive();
    }

    public static void driveWithManuel(Manual manual) {
        manual.drive();
    }

}
