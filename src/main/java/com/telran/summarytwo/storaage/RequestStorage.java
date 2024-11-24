package com.telran.summarytwo.storaage;

import java.util.ArrayList;
import java.util.List;

/**
 *   // google.com
 *         //amazon.com
 *
 *
 *         // ebay.com
 *         // ebay.de
 *
 *         //yahoo.com
 *         //wallmart.com
 *
 *

 */
public class RequestStorage {

    private List<List<String>> requestList = new ArrayList<>();

    public RequestStorage(List<List<String>> requestList) {
        this.requestList = requestList;
    }

    public List<List<String>> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<List<String>> requestList) {
        this.requestList = requestList;
    }
}
