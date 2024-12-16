package com.telran.homework.homework02.model;

import com.telran.homework.homework02.model.dough.Dough;
import com.telran.homework.homework02.model.filling.Filling;
import com.telran.homework.homework02.model.topping.Topping;

public class Donut {

    private final Dough type;

    private final Filling filling;

    private final Topping topping;

    private final Size size;

    public Donut(Dough type, Filling filling, Topping topping, Size size) {
        this.type = type;
        this.filling = filling;
        this.topping = topping;
        this.size = size;
    }

    @Override
    public String toString() {
        String fillingText = (filling != null) ? filling.toString() : "No filling.\n";
        String toppingText = (topping != null) ? topping.toString() : "No sprinkles.\n";
        return "\uD83C\uDF69 Here is your "
                + size.toString().toLowerCase() + " " + type + " donut. / "
                + ". \n" + fillingText + toppingText;
    }
}
