package com.telran.lesson10;

import lombok.Setter;

@Setter
public class Dog {

    private String name;

    private int age;

    private Color color;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Dog)) {
            return false;
        }

        Dog dog = (Dog) obj;

        if(this.name == null){
            return false;
        }
        return this.name.equals(dog.name) && this.age == dog.age && this.color == dog.color;
    }
}
