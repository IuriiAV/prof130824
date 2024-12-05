package com.telran.lesson10;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private Color color;

    // Контракт между equals and hashcode
    // У одинаковых объектов , всегда одинаковые hashcode

        // Порядок сравнения:
    // Сначала сравнивается hashcode , если он разный у двух объектов,

    // Если hashcode одинаковый у двух объектов (одинаковые объекты или коллизия)

    @Override
    public boolean equals(Object o) {
        // 1
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //4
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && color == cat.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}
