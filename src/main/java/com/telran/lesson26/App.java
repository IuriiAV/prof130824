package com.telran.lesson26;

import java.lang.reflect.Field;

public class App {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ATM atm = new ATM();
        atm.depositMoney(500);

        Class<? extends ATM> aClass = atm.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field: declaredFields){
            System.out.println(field);
        }

            Field iban = aClass.getDeclaredField("iban");
            iban.setAccessible(true);
            System.out.println(iban.get(atm));
            iban.set(atm, "DE 979797 46646 646 46");

        atm.depositMoney(1000);
    }
}
