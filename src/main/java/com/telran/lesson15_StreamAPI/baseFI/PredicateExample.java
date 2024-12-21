package com.telran.lesson15_StreamAPI.baseFI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * **
 * Predicate :
 * method test
 * принимает Один параметр, и возвращает boolean
 */

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> comparator = (a) -> a > 10;
        System.out.println(comparator.test(5));

        Product apple = new Product("Apple", 1500, true);
        Predicate<Product> startsWithA = (product) -> product.getTitle().startsWith("A");
        Predicate<Product> inStock = (product) -> product.isInStock();
        Predicate<Product> price = product -> product.getPrice() < 1000;
        boolean result1 = startsWithA.test(apple);
        boolean result2 = inStock.test(apple);

        boolean test = startsWithA.and(inStock).and(price).test(apple);


        List<Product> products = Arrays.asList(
                new Product("Apple", 1500, true),
                new Product("Banana", 2000, false),
                new Product("Lemon", 1800, true),
                new Product("Pineapple", 300, true),
                new Product("Carrot", 2500, false));

        Predicate<Product> filterBuStock = (product) -> product.isInStock();
        Predicate<Product> filterByPrice = (product) -> product.getPrice() > 2000;
        Predicate<Product> filterByName = (product) -> product.getTitle().startsWith("L");

        List<Product> listByPrice = filter(products, filterByPrice);
        List<Product> listByStock = filter(products, filterBuStock);
        List<Product> listByName = filter(products, filterByName);

        System.out.println("listByPrice " + listByPrice);
        System.out.println("listByStock " + listByStock);
        System.out.println("listByName " + listByName);

    }

    private static List<Product> filter(List<Product> products,
                                        List<Predicate<Product>> filter) {
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            Predicate<Product> startFilter = filter.get(0);
            for (int i = 1; i < filter.size(); i++) {
                startFilter = startFilter.and(filter.get(i));
            }
            boolean test = startFilter.test(product);
            if (test) {
                list.add(product);
            }
        }
        return list;
    }

    private static List<Product> filter(List<Product> products,
                                        Predicate<Product> filter) {
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (filter.test(product)) {
                list.add(product);
            }
        }
        return list;
    }
}
