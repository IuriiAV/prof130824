package com.telran.lesson2.examples;

import com.telran.lesson2.exampletwo.BritishCat;

public class ExampleApp {

    public static void main(String[] args) {
        //One -> Two ->Three
        One one = new One();
        one.methodOne();

        Two two = new Two();
        two.methodTwo();
        two.methodOne();

        Three three = new Three();
        three.methodThree();
        three.methodTwo();
        three.methodOne();
    }
}
