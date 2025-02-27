package com.telran.homework2.model;

public class ChocoRaisinDonut extends ChocoDonuts {

    private Raisin raisin;

    public ChocoRaisinDonut(String title) {
        super(title);

    }

    public Raisin getRaisin() {
        return raisin;
    }

    public void setRaisin(Raisin raisin) {
        this.raisin = raisin;
    }

    @Override
    public String toString() {
        String title = super.toString();
        return title + " " + raisin;
    }
}
