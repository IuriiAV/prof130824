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

        iban.set(atm, "DE 43454 54353 656456");

        atm.depositMoney(1000);

    }
}
