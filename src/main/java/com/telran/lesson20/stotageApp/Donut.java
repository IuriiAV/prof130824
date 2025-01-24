package com.telran.lesson20.stotageApp;

import lombok.ToString;

@ToString
public class Donut extends AbstractProduct {

    private String title;

    public Donut(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
