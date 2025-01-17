package com.telran.summary2211;

import java.util.Arrays;
import java.util.List;

public class HWR {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 42, 5, 6, 3, 56, 4);
        Integer max = findMax(integerList);
        if (max != null) {
            System.out.println(max);
        }
    }

    private static Integer findMax(List<Integer> integerList) {
        if (integerList == null && integerList.isEmpty()) {
            return null;
        }
        int max = integerList.get(0);
        for (Integer value : integerList) {
            max = Math.max(max, value);
        }
        return max;
    }
}
