package com.telran.mylesson26ReflectionAPI.bank;

import java.lang.reflect.Field;

public class AtmApp {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
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
        iban.set(atm,"DE 1111 2222 3333 4444");
        atm.depositMoney(1000);

    }
}
