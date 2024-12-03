package com.telran.lesson10;

import java.util.Objects;

public class Cat {


    private String name;

    private int age;

    private Color color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && color == cat.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}
