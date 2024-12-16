package com.telran.summaryfive;

import com.telran.summaryfive.model.Product;

import java.util.Scanner;

/**
 * 1 - English
 * 2-  German
 * 3-  French
 *
 * 1) Soup
 * 2) Pasta
 * 3) Burger
 * 4) Wine
 *
 * soup description : Eng, Ger, Fr
 * pasta description : Eng, Ger, Fr
 * burger description : Eng, Ger, Fr
 * wine description : Eng, Ger, Fr
 *
 *
 *
 */
public class MenuApp {

    public static void main(String[] args) {
        LanguageStorage languageStorage = new LanguageStorage();
        ProductStorage productStorage = new ProductStorage();
        InfoStorage infoStorage = new InfoStorage();

        System.out.println("Choose 1-Admin, 2-User");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        switch (data) {
            case 1 -> new AdminController(languageStorage, productStorage, infoStorage).start();
            case 2 -> new UserController(languageStorage, productStorage, infoStorage).start();
            default -> System.out.println("Bye!!");
        }
    }
}



