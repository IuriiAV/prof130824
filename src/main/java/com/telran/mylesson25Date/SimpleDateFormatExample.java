package com.telran.mylesson25Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy/dd/MM");
        String format = dateFormat.format(new Date());
        System.out.println(format);
    }
}
