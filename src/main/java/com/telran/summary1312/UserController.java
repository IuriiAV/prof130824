package com.telran.summary1312;

import com.telran.summary1312.model.Product;

import java.util.Scanner;

public class UserController {

    private LanguageStorage languageStorage;

    private ProductStorage productStorage;

    private InfoStorage infoStorage;

    public UserController(LanguageStorage languageStorage, ProductStorage productStorage, InfoStorage infoStorage) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
    }

    public void start() {

        System.out.println("Please choose your language : ");
        languageStorage.printLanguages();
        Scanner scanner = new Scanner(System.in);
        int userLanguage = scanner.nextInt();

        String language = languageStorage.getLanguage(userLanguage);

        System.out.println("Ok.Your language : " + language);

        System.out.println("Choose your product : ");
        productStorage.printProducts();
        int userProduct = scanner.nextInt();

        Product product = productStorage.getProduct(userProduct);

        System.out.println("Ok.Your product is " + product.getTitle());


        String description = infoStorage.getDescription(product, language);
        System.out.println("Description : " + description);
        scanner.close();
    }
}
