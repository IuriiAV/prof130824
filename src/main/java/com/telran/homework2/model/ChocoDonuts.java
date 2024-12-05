package com.telran.homework2.model;

public abstract class ChocoDonuts extends Donut{

    private Chocolate chocolate;

    public ChocoDonuts(String title) {
        super(title);
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    @Override
    public String toString() {
        String title = super.toString();
        return title + " " + chocolate;
    }
}
