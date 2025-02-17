package com.telran.h_13;

import java.util.List;

public class NumberAnalyzer {

    public int getMin(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        return list.stream().min(Integer::compareTo).orElse(0);
    }

    public Integer getMax(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        return list.stream().max(Integer::compareTo).orElse(0);
    }


    public Integer getAverage(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        return (int) list.stream().mapToDouble(Integer::intValue).average().orElse(0);
    }
}
