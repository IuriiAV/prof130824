package com.telran.summary2.storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StorageApp {
    /**
     * // google.com
     * // amazon.com
     *
     * // ebay.com
     * // ebay.de
     *
     * //yahoo.com
     * //wallmart.com
     * @param args
     */
    public static void main(String[] args) {

        List<List<String>> list = new ArrayList<>();

        List<String> listString1 = Arrays.asList("google.com", "amazon.com");
        List<String> listString2 = Arrays.asList("ebay.com", "ebay.de");
        List<String> listString3 = Arrays.asList("yahoo.com", "wallmart.com");


        list.add(listString1);
        list.add(listString2);
        list.add(listString3);

        RequestStorage requestStorage = new RequestStorage(list);

        List<List<String>> requestList = requestStorage.getRequestList();
        for (int i = 0; i < requestList.size(); i++) {
            List<String> list1 = requestList.get(i);
            Iterator<String> iterator = list1.iterator();
            while (iterator.hasNext()){
                String value = iterator.next();
                System.out.println(value);
            }
        }
    }
}
