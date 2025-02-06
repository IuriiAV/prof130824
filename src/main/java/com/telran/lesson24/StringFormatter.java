package com.telran.lesson24;

public class StringFormatter {

    public String reversStringLoweCase(String text){
if (text == null || text.equals(" ")){
    throw new IllegalArgumentException("String is null");
}
        String ignoreCase = text.toLowerCase();

        return new StringBuilder(ignoreCase).reverse().toString();
    }
}
