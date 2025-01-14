package com.telran.lesson17StreamApi.Task4;

public class Cat {

    private String name;

    private int age;

    private boolean isHungry;

    private Color color;

    public Cat(String name, int age, boolean isHungry, Color color) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                ", color=" + color +
                '}';
    }
}
