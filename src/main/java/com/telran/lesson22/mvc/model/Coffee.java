package com.telran.lesson22.mvc.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Coffee extends AbstractProduct{

    private final String title;
}
