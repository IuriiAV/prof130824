package com.telran.summary5;

import com.telran.summary5.model.Product;

import java.util.Scanner;

public class UserController {

    public UserController(LanguageStorage languageStorage, ProductStorage productStorage, InfoStorage infoStorage) {


    }

    public void start(){

        LanguageStorage languageStorage = new LanguageStorage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choices your language : ");
        languageStorage.printLanguages();
        int userLenguage = sc.nextInt();
        String language = languageStorage.getLanguage(userLenguage);
        System.out.println("OK. Your language is " + language);

        ProductStorage productStorage = new ProductStorage();
        System.out.println("Choices products :");
        productStorage.printProduct();
        int userProduct = sc.nextInt();
        Product product = productStorage.getProduct(userProduct);
        System.out.println("Your product is " + product);

        InfoStorage infoStorage = new InfoStorage();

        String description = infoStorage.getDiscription(product, language);
        System.out.println("Description : " + description );

    }
}
