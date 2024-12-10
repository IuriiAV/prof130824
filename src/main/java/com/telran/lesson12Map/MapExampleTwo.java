package com.telran.lesson12Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExampleTwo {

    public static void main(String[] args) {
        Map<Integer, List<String>> map = new HashMap<>();
        List<String> strings = new ArrayList<>();
        map.put(1, strings);

        List<String> strings1 = map.get(1);

        Map<String, String> innerMap = new HashMap<>();
        Map<String,Map<String,String>> extMap = new HashMap<>();
        extMap.put("one", innerMap);
        Map<String, String> map1 = extMap.get("one");
        innerMap.put("one","oneValue");
        innerMap.put("two", "twoValue");
    }
}
