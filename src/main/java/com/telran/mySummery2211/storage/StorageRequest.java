package com.telran.mySummery2211.storage;

import java.util.ArrayList;
import java.util.List;

public class StorageRequest {

    private List<List<String>> requests = new ArrayList<>();

    public StorageRequest(List<List<String>> requests) {
        this.requests = requests;
    }

    public List<List<String>> getRequests() {
        return requests;
    }

    public void setRequests(List<List<String>> requests) {
        this.requests = requests;
    }
}
