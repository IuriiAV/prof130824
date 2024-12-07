package com.telran.homework.homework_2;

import com.telran.homework.homework_2.filling.Filling;
import com.telran.homework.homework_2.filling.FillingApple;
import com.telran.homework.homework_2.filling.FillingBanana;
import com.telran.homework.homework_2.filling.FillingCaramel;
import com.telran.homework.homework_2.topping.Topping;
import com.telran.homework.homework_2.topping.ToppingChocolate;
import com.telran.homework.homework_2.topping.ToppingHoney;
import com.telran.homework.homework_2.topping.ToppingSprinkle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DonutMachine {

    private Oil oil;
    private Dough dough;


    private List<Filling> fillings = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();

    public DonutMachine() {
        fillFillingsList();
        fillToppingList();
        dough = new Dough();
        oil = new Oil();
    }

    private void fillToppingList() {
        ToppingChocolate toppingChocolate = new ToppingChocolate("Chocolate");
        ToppingHoney toppingHoney = new ToppingHoney("Honey");
        ToppingSprinkle toppingSprinkle = new ToppingSprinkle("Sprinkle");
        toppings.add(toppingChocolate);
        toppings.add(toppingSprinkle);
        toppings.add(toppingHoney);
    }

    private void fillFillingsList() {
        fillings.add(new FillingCaramel("Caramel"));
        fillings.add(new FillingBanana("Banana"));
        fillings.add(new FillingApple("Apple"));

    }

    public String printFillingsList() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fillings.size(); i++) {
            Filling filling = fillings.get(i);
            result.append(i).append(" -> ").append(filling.getName()).append("\n");
        }
        return result.toString();
    }

    public String printToppingList() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < toppings.size(); i++) {
            Topping topping = toppings.get(i);
            result.append(i).append(" -> ").append(topping.getName()).append("\n");
        }
        return result.toString();
    }

    public Donut getDonut(int filling, int topping) {
        Donut donut = new Donut(toppings.get(topping), fillings.get(filling), dough);
        return donut;
    }

}
