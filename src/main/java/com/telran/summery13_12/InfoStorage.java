package com.telran.summery13_12;

import com.telran.summery13_12.model.Product;

import java.util.HashMap;
import java.util.Map;

public class InfoStorage {
    //lang -> desc
    //prodId -> en-desc, de-desc, fr-desc

    private Map<Product, Map<String,String>> infoMap = new HashMap<>();

    public InfoStorage() {
        init();
    }

    private void init() {
        Map<String,String> soupMap = new HashMap<>();
        soupMap.put("English", "English Soup");
        soupMap.put("German", "German Soup");
        soupMap.put("French", "French Soup");

        Map<String,String> pastaMap = new HashMap<>();
        pastaMap.put("English", "English pasta");
        pastaMap.put("German", "German pasta");
        pastaMap.put("French", "French pasta");

        Map<String,String> burgerMap = new HashMap<>();
        burgerMap.put("English", "English burger");
        burgerMap.put("German", "German burger");
        burgerMap.put("French", "French burger");

        Map<String,String> wineMap = new HashMap<>();
        wineMap.put("English", "English wine");
        wineMap.put("German", "German wine");
        wineMap.put("French", "French wine");

        infoMap.put(new Product(1, "soup"),soupMap);
        infoMap.put(new Product(2,"pasta"), pastaMap);
        infoMap.put(new Product(3, "burger"), burgerMap);
        infoMap.put(new Product(4, "wine"), wineMap);
    }

    public String getdesc(Product product, String language){
        Map<String, String> descMap = infoMap.get(product);
        return descMap.get(language);
    }

    public void addDesc(Product product, String language, String description){
        Map<String, String> temp = new HashMap<>();
        Map<String, String> descMap = infoMap.getOrDefault(product, temp);
        descMap.put(language, description);
        infoMap.put(product, descMap);
    }
}
