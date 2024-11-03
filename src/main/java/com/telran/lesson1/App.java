package com.telran.lesson1;


//Write code -> compile to byte code -> run on VM
public class App {

    public static void main(String[] args) {
        // new - создание объекта на основании какого либо класса
        Car carOne = new Car();  //#FFHH03 Car(model, color)
        carOne.model = "VW";
        carOne.color = "Red";

        Car carTwo = new Car();  //#FFEE02 Car(model, color)
        carTwo.color = "Black";
        carTwo.model = "Audi";
        //Win ctr+alt+l , Mac : option+command+l
        Car carThree = new Car();
        carThree.model = "VW";
        carThree.color = "Red";

        String model = carOne.model;
        System.out.println("Car one model " + carOne.model + " , car one color "
                + carOne.color);

        carOne.startEngine();
        carTwo.startEngine();
    }
}
