package com.telran.lesson22.mvc.base;

import com.telran.lesson22.mvc.model.AbstractProduct;

import java.util.List;

public interface Storage {

    List<AbstractProduct> getAll();
}
