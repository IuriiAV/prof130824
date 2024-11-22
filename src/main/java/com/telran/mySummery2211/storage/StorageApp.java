package com.telran.mySummery2211.storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StorageApp {

    public static void main(String[] args) {
        List<List<String>> requests = new ArrayList<>();
        List<String> requestOne = Arrays.asList("google.com", "amazon.com");
        List<String> requestTwo = Arrays.asList("ebay.com", "ebay.de");
        List<String> requestThree = Arrays.asList("yahoo.com", "wallmart.com");

        requests.add(requestOne);
        requests.add(requestTwo);
        requests.add(requestThree);
        StorageRequest storageRequest = new StorageRequest(requests);

        List<List<String>> requests1 = storageRequest.getRequests();

        for (int i = 0; i < requests1.size(); i++) {
            List<String> list = requests1.get(i);
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
