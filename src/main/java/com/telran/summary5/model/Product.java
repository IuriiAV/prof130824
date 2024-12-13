package com.telran.summary5.model;

import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
public class Product {

    private  int id;

    private String title;

    public Product(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return  title + '\'';
    }
}
