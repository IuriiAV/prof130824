package com.telran.summaryfive;

import com.telran.summaryfive.model.Product;

import java.util.HashMap;
import java.util.Map;

public class InfoStorage {
    //language -> description
    //productId -> en-descr, ge -descr, fr-descr

    private Map<Product, Map<String, String>> infoMap = new HashMap<>();

    public InfoStorage() {
        init();
    }

    private void init() {
        Map<String, String> soupMap = new HashMap<>();
        soupMap.put("English", "Soup English info");
        soupMap.put("German", "Soup German info");
        soupMap.put("French", "Soup French info");

        Map<String, String> pastaMap = new HashMap<>();
        pastaMap.put("English", "Pasta English info");
        pastaMap.put("German", "Pasta German info");
        pastaMap.put("French", "Pasta French info");

        Map<String, String> burgerMap = new HashMap<>();
        burgerMap.put("English", "Burger English info");
        burgerMap.put("German", "Burger German info");
        burgerMap.put("French", "Burger French info");

        Map<String, String> wineMap = new HashMap<>();
        wineMap.put("English", "Wine English info");
        wineMap.put("German", "Wine German info");
        wineMap.put("French", "Wine French info");

        infoMap.put(new Product(1, "Soup"), soupMap);
        infoMap.put(new Product(2, "Pasta"), pastaMap);
        infoMap.put(new Product(3, "Burger"), burgerMap);
        infoMap.put(new Product(4, "Wine"), wineMap);
    }

    public String getDescription(Product product, String language) {
        Map<String, String> descriptionMap = infoMap.get(product);
        return descriptionMap.get(language);
    }

    public void addDescription(Product product, String language, String description) {
        Map<String, String> template = new HashMap<>();
        Map<String, String> descMap = infoMap.getOrDefault(product, template);
        descMap.put(language, description);
    }
}