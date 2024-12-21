package com.telran.lesson15_StreamAPI.baseFI;

public class Product {

    private String title;

    private double price;

    private boolean inStock;

    public Product(String title, double price, boolean inStock) {
        this.title = title;
        this.price = price;
        this.inStock = inStock;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }
}
