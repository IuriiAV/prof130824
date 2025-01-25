package com.telran.lesson15.basefi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate
 * метод test;
 * Принимает один параметр и возвращает результат истина или ложь
 */
public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> comparator = (a) -> a > 10;
        System.out.println(comparator.test(5));
        System.out.println(comparator.test(15));

        Product apple = new Product("Apple", 1500, true);
        Predicate<Product> startsWithA = (product) -> product.getTitle().startsWith("A");
        Predicate<Product> inStock = product -> product.isInStock();
        Predicate<Product> price = product -> product.getPrice() < 1000;
        boolean resultOne = startsWithA.test(apple);
        boolean resultTwo = inStock.test(apple);
        boolean test = startsWithA.and(inStock).and(price).test(apple);
        System.out.println("Apple start with A and in stock " + test);


        List<Product> products = Arrays.asList(
                new Product("Apple", 1500, true),
                new Product("Banana", 2000, false),
                new Product("Lemon", 1800, true),
                new Product("Pineapple", 300, true),
                new Product("Carrot", 2500, false));

        Predicate<Product> filterByStock = (product) -> product.isInStock();
        Predicate<Product> filterByPrice = product -> product.getPrice() > 2000;
        Predicate<Product> filterByName = product -> product.getTitle().startsWith("A");

        List<Product> listByPrice = filter(products, filterByPrice);
        List<Product> listByName = filter(products, filterByName);
        List<Product> listByStock = filter(products, filterByStock);

        System.out.println("By price " + listByPrice);
        System.out.println("By name " + listByName);
        System.out.println("By stock " + listByStock);
        List<Predicate<Product>> filters = Arrays.asList(
                product -> product.isInStock(),
                product -> product.getPrice() >= 1500);
        List<Product> filter = filter(products, filters);
        System.out.println("By price and stock : " + filter);
    }

    private static List<Product> filter(List<Product> products,
                                        List<Predicate<Product>> filter) {
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            Predicate<Product> startFilter = filter.get(0);
            for (int i = 1; i <  filter.size(); i++) {
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
            boolean result = filter.test(product);
            if (result) {
                list.add(product);
            }
        }
        return list;
    }

//    private static List<Product> filterByInStock(List<Product> products) {
//        List<Product> list = new ArrayList<>();
//        for (Product product : products) {
//            if (product.isInStock()) {
//                list.add(product);
//            }
//        }
//        return list;
//    }

//    private static List<Product> filterByPrice(List<Product> products, double price) {
//        List<Product> list = new ArrayList<>();
//        for (Product product : products) {
//            if (product.getPrice() > price) {
//                list.add(product);
//            }
//        }
//        return list;
//    }
}
