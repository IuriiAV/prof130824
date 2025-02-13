package com.telran.lesson26.bank;

import java.lang.reflect.Field;

public class AtmApp {

    public static void main(String[] args) throws Exception {
        ATM atm = new ATM();
        atm.depositMoney(500);

        Class<? extends ATM> clazz = atm.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        Field iban = clazz.getDeclaredField("iban");
        iban.setAccessible(true);
        System.out.println(iban.get(atm));

        iban.set(atm,"DE 434354 543225 665453");

        atm.depositMoney(10000);
    }
}
