package com.telran.mylesson25Date;

import java.util.Date;

public class SystemCMExample {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // для замера

        Date date = new Date(System.currentTimeMillis());

    }
}
