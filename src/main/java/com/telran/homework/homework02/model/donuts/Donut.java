package com.telran.homework.homework02.model.donuts;

import com.telran.homework.homework02.model.dough.Dough;
import com.telran.homework.homework02.model.fillings.Filling;
import com.telran.homework.homework02.model.toppings.Topping;

public class Donut {

    private Dough type;

    private Filling filling;

    private Topping topping;

    private Size size = Size.STANDARD;

    public enum Size {
        SMALL,
        STANDARD,
        LARGE
    }

    public Donut(Dough type, Filling filling, Topping topping) {
        this.type = type;
        this.filling = filling;
        this.topping = topping;
    }

    public Donut(Dough type, Size size, Filling filling, Topping topping) {
        this.type = type;
        this.size = size;
        this.filling = filling;
        this.topping = topping;
    }

    public Dough getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Your donut " + type + " (" + size + " size)" + filling + topping;
    }
}
