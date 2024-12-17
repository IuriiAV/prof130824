package com.telran.summary5;

import com.telran.summary5.model.Product;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AdminController {

    public AdminController(LanguageStorage languageStorage, ProductStorage productStorage, InfoStorage infoStorage) {

    }

    @SneakyThrows
    public void start(){
        System.out.println("Choices your language : ");
        LanguageStorage languageStorage = new LanguageStorage();
        languageStorage.printLanguages();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();
        String language = languageStorage.getLanguage(Integer.parseInt(data));



        System.out.println("Input product title :");
        String title = reader.readLine();

        ProductStorage productStorage = new ProductStorage();
        Product product = productStorage.getOrCreate(title);
        System.out.println(" " + product);

        System.out.println("Input");
        String descr = reader.readLine();

        InfoStorage infoStorage = new InfoStorage();
        infoStorage.addDescription(product,language,descr);



    }
}
