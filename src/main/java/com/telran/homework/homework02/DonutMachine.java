package com.telran.homework.homework02;

import com.telran.homework.homework02.model.Donut;
import com.telran.homework.homework02.model.Size;
import com.telran.homework.homework02.model.dough.*;
import com.telran.homework.homework02.model.filling.*;
import com.telran.homework.homework02.model.topping.*;

public class DonutMachine {

    private final Dough[] doughList = new Dough[5];

    private final Filling[] fillingList = new Filling[6];

    private final Topping[] toppingList = new Topping[6];

    public DonutMachine() {
        fillDoughList();
        fillFillingList();
        fillToppingList();
    }

    private void fillDoughList() {
        doughList[0] = new ClassicDough("Classic");
        doughList[1] = new VeganDough("Vegan");
        doughList[2] = new PotatoDough("Potato");
        doughList[3] = new CakeDough("Cake");
        doughList[4] = new CronutDough("Cronut");
    }

    private void fillFillingList() {
        fillingList[0] = null;
        fillingList[1] = new AppleFilling("Apple");
        fillingList[2] = new BananaFilling("Banana");
        fillingList[3] = new CaramelFilling("Caramel");
        fillingList[4] = new JamFilling("Jam");
        fillingList[5] = new NutellaFilling("Nutella");
    }

    private void fillToppingList() {
        toppingList[0] = null;
        toppingList[1] = new PowderedSugarTopping("Powdered Sugar");
        toppingList[2] = new ChocolateTopping("Chocolate");
        toppingList[3] = new HoneyTopping("Honey");
        toppingList[4] = new SprinkleTopping("Color Sprinkles");
        toppingList[5] = new WhiteChocolateTopping("White Chocolate");
    }

    public String getDoughList() {
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < doughList.length; i++) {
            list.append(i + 1).append(" -> ").append(doughList[i].getType()).append("\n");
        }
        return list.toString();
    }

    public String getFillingList() {
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < fillingList.length; i++) {
            if (i == 0) {
                list.append(i).append(" -> ").append("No Filling \n");
                continue;
            }
            list.append(i).append(" -> ").append(fillingList[i].getTitle()).append("\n");
        }
        return list.toString();
    }

    public String getToppingList() {
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < toppingList.length; i++) {
            if (i == 0) {
                list.append(i).append(" -> ").append("No Sprinkle \n");
                continue;
            }
            list.append(i).append(" -> ").append(toppingList[i].getTitle()).append("\n");
        }
        return list.toString();
    }

    public String getSizeList() {
        return "1 -> " + Size.SMALL + "\n2 -> " + Size.STANDARD + "\n3 -> " + Size.LARGE;
    }

    public Donut makeDonut(int dough, int filling, int topping, int size) {
        return new Donut(doughList[dough - 1], fillingList[filling], toppingList[topping], Size.values()[size - 1]);
    }
}
