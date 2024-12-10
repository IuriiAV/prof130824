package com.telran.lesson12;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        String st = "aknrjvdiojnwjnodfpwetxzcmnkbnuqwzlkjhugytfdrxfcvb";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < st.length(); i++) {
           char key = st.charAt(i);

            int value = map.getOrDefault(key, 0);
            map.put(key,++value);
//            if (map.containsKey(key)){
//               int value = map.get(key);
//               value++;
//               map.put(key,value);
//
//           } else{
//               map.put(key,1);
//           }
        }
        map.forEach((c,i) -> System.out.println(c + " " + i));


    }
}
