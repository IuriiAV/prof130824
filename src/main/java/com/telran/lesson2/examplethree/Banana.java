package com.telran.lesson2.examplethree;

public class Banana extends Fruit {

    private String source;

    public Banana(String title, int weight, String color) {
        super(title, weight, color);
    }

    public Banana(String title, int weight, String color, String source) {
        super(title, weight, color);
        this.source = source;
    }

    //В наследниках можно добавлять свою логику к родительской
    @Override
    public String toString() {
        String result = super.toString();
        return result + " source " + source;
    }
}
