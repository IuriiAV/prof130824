package com.telran.homework.homework_2;

import com.telran.homework.homework_2.filling.Filling;
import com.telran.homework.homework_2.topping.Topping;

public class Donut {
    private Topping topping;
    private Filling filling;
    private Dough dough;

    public Donut(Topping topping, Filling filling, Dough dough) {
        this.topping = topping;
        this.filling = filling;
        this.dough = dough;
    }

    @Override
    public String toString() {
        return
                "topping = " + topping +
                ", filling = " + filling + "\uD83C\uDF69";
    }

}
