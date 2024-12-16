package com.telran.summary1312;

import com.telran.summary1312.model.Product;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AdminController {

    private LanguageStorage languageStorage;

    private ProductStorage productStorage;

    private InfoStorage infoStorage;

    public AdminController(LanguageStorage languageStorage, ProductStorage productStorage, InfoStorage infoStorage) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
    }

    @SneakyThrows
    public void start() {
        System.out.println("Choose language : ");
        languageStorage.printLanguages();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();

        String language = languageStorage.getLanguage(Integer.parseInt(data));

        System.out.println("Input product title :");
        String title = reader.readLine();
        Product product = productStorage.getOrCreate(title);
        System.out.println("" + product.getTitle() + "_" + product.getId());

        System.out.println("Input your description : ");
        String descr = reader.readLine();

        infoStorage.addDescription(product, language, descr);

        reader.close();
    }
}
