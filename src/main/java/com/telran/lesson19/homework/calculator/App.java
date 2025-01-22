package com.telran.lesson19.homework.calculator;

public class App {

    public static void main(String[] args) {
        String pathFrom = "/Users/dogoda/java/prof130824/src/main/java/com/telran/lesson19/homework/calculator/exercises.txt";
        String pathTo = "/Users/dogoda/java/prof130824/src/main/java/com/telran/lesson19/homework/calculator/solutions.txt";
        Calculator calculator = new Calculator();
        calculator.writeSolve(pathFrom, pathTo);
    }
}
