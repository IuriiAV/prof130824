package com.telran.summery13_12;

import com.telran.summery13_12.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductStorage {

    private Map<Integer, Product> productMap = new HashMap<>();

    public ProductStorage() {
        init();
    }

    private void init() {
        Product soup = new Product(1, "soup");
        Product pasta = new Product(2, "pasta");
        Product burger = new Product(3, "burger");
        Product wine = new Product(4, "wine");

        productMap.put(pasta.getId(), pasta);
        productMap.put(soup.getId(), soup);
        productMap.put(burger.getId(), burger);
        productMap.put(wine.getId(), wine);
    }

    public void printProducts() {
        // productMap.forEach((k,v) -> System.out.println(k));
        for (Map.Entry<Integer, Product> productEntry : productMap.entrySet()) {
            System.out.println("" + productEntry.getKey() + " - " + productEntry.getValue().getTitle());
        }
    }

    public Product getProduct(int key) {
        return productMap.get(key);
    }

    public Product getOrCreate(String title) {
        for (Product product : productMap.values()) {
            if (product.getTitle().equals(title)) {
                return product;
            }
        }

        int maxKey = 0;
        for (Integer key : productMap.keySet()) {
            maxKey = Math.max(key, maxKey);
        }
        Product product = new Product(maxKey + 1, title);
        productMap.put(product.getId(), product);
        return product;
    }
}
