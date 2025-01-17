package com.telran.lesson17;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cat {

    private String name;

    private  int age;

    private boolean isHungry;

    private Color color;

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
